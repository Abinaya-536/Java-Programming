#include <stdio.h>

int main() {
    int n;
    int arr[100];

   
    scanf("%d", &n);

    
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int max = arr[n - 1];
    arr[n - 1] = -1; 

    
    for(int i = n - 2; i >= 0; i--) {
        int temp = arr[i];
        arr[i] = max;

        if(temp > max) {
            max = temp;
        }
    }

  
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
