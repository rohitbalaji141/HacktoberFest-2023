#include <stdio.h>

int main(void) {
    int n; // Declaring the required variable

    printf("Enter an integer: ");  // Prompting user for input
    if (scanf("%d", &n) != 1) {  // Checking if the input is valid
        printf("Invalid input. Please enter an integer.\n");
        return 1;  // Exit with an error code
    }

    if (n % 2 == 0) {  // Checking if the number is even
        printf("%d is an even number!\n", n);
    } else {
        printf("%d is an odd number!\n", n);
    }

    return 0; // End of main
}
