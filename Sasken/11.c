//Check if a string is a palindrome
#include<stdio.h>
#include<string.h>
void main(){
    int flag=1;
    char str[]="hoh";
    int len=strlen(str);
    // printf("%d",len);
    // printf("%s",str);
    for(int i=0;i<len/2;i++){
        if(str[i]!=str[len-i-1]){
            flag=0;
            break;
        }
    }
    if(flag==1){
        printf("palindrome");
    } 
    else{
        printf("not a palindrome");
    } 

    //int i;

}