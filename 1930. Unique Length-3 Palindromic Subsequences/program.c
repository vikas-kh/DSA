#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int countPalindromicSubsequence(char* s) {
    int n = strlen(s);
    int left_count[26] = {0};
    int right_count[26] = {0};
    bool seen[26][26] = {false};

    for (int i = 0; i < n; i++) {
        right_count[s[i] - 'a']++;
    }

    int unique_count = 0;

    for (int i = 0; i < n; i++) {
        right_count[s[i] - 'a']--;

        for (int c = 0; c < 26; c++) {
            if (left_count[c] > 0 && right_count[c] > 0) {
                if (!seen[c][s[i] - 'a']) {
                    seen[c][s[i] - 'a'] = true;
                    unique_count++;
                }
            }
        }

        left_count[s[i] - 'a']++;
    }

    return unique_count;
}

int main() {
    char s1[] = "aabca";
    printf("Unique Palindromic Subsequences: %d\n", countPalindromicSubsequence(s1));

    char s2[] = "adc";
    printf("Unique Palindromic Subsequences: %d\n", countPalindromicSubsequence(s2));

    char s3[] = "bbcbaba";
    printf("Unique Palindromic Subsequences: %d\n", countPalindromicSubsequence(s3));

    return 0;
}
