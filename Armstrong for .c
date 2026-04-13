#include <stdio.h>

int main() {
    int N, temp, sum = 0;

    scanf("%d", &N);

    temp = N;

    for (int n = N; n > 0; n = n / 10) {
        int digit = n % 10;
        sum = sum + digit * digit * digit;  
    }

    if (sum == temp)
        printf("Yes");
    else
        printf("No");

    return 0;
}
