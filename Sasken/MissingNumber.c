#include <stdio.h>

// Function to find the missing number
int findMissing(int arr[], int n) {
    int i, total, sum = 0;

    // expected sum of 1..n
    total = n * (n + 1) / 2;

    // actual sum of given numbers
    for (i = 0; i < n - 1; i++) {
        sum += arr[i];
    }

    // missing number
    return total - sum;
}

int main() {
    int n, i;
    
    printf("Enter n (last number in sequence): ");
    scanf("%d", &n);

    int arr[n-1];  // sequence has n-1 numbers

    printf("Enter %d numbers:\n", n-1);
    for (i = 0; i < n-1; i++) {
        scanf("%d", &arr[i]);
    }

    int missing = findMissing(arr, n);

    printf("Missing number is: %d\n", missing);

    return 0;
}
