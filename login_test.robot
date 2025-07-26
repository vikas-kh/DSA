*** Settings ***
Library    SeleniumLibrary
Suite Setup    Open Browser To FlexiSpot Portal
Suite Teardown    Close Browser

*** Variables ***
${URL}         https://your.flexispot-app.com
${BROWSER}     chrome
${USERNAME}    emp002
${PASSWORD}    emp@123
${DATE}        2025-07-24
${DESK_ID_1}   D-101
${DESK_ID_2}   D-102
${ERROR_MSG}   You have already booked a desk for this day

*** Test Cases ***
FS_003 - Booking Rule: One Desk Per Day
    [Documentation]    Ensure user cannot book more than one desk per day.
    
    Login As Employee
    Book First Desk    ${DESK_ID_1}
    Attempt Second Booking    ${DESK_ID_2}
    Verify Error Message Is Displayed    ${ERROR_MSG}

*** Keywords ***
Open Browser To FlexiSpot Portal
    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window
    Wait Until Page Contains Element    name=username

Login As Employee
    Input Text    name=username    ${USERNAME}
    Input Text    name=password    ${PASSWORD}
    Click Button    xpath=//button[@type='submit']
    Wait Until Page Contains    Dashboard

Book First Desk
    [Arguments]    ${desk_id}
    Click Element    xpath=//div[@data-desk-id="${desk_id}"]
    Click Button     xpath=//button[text()="Book"]
    Wait Until Page Contains    Booking Confirmed

Attempt Second Booking
    [Arguments]    ${desk_id}
    Click Element    xpath=//div[@data-desk-id="${desk_id}"]
    Click Button     xpath=//button[text()="Book"]
    Wait Until Page Contains Element    xpath=//div[contains(@class, 'error')]

Verify Error Message Is Displayed
    [Arguments]    ${expected_error}
    Page Should Contain    ${expected_error}
