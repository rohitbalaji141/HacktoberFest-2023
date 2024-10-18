#include <stdio.h>

int main(void) {
    int n; // Declaring the required variable

    // Prompting user for input
    printf("Enter an integer: ");
    if (scanf("%d", &n) != 1) {  // Checking if the input is valid
        printf("Invalid input. Please enter an integer.\n");
        return 1;  // Exit with an error code
    }

    // Checking if the number is even or odd
    if (n % 2 == 0) {  // If remainder is 0, it's even
        printf("%d is an even number!\n", n);
    } else {  // Otherwise, it's odd
        printf("%d is an odd number!\n", n);
    }

    return 0; // End of main
}
