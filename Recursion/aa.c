#include <stdio.h>
#include <conio.h>

int fibonacci(int n) {
    if(n == 0) {
        return 0;
    }

    if(n == 1){
        return 1;
    }

    return fibonacci(n-1) + fibonacci(n-2);
    
}

void main(){
    int n, res;
    printf("Enter the value of n for Fibonacci: ");
    scanf("%d",&n);

    res = fibonacci(n);

    printf("%d", &res);

}