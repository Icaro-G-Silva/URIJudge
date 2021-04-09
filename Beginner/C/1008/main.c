#include <stdio.h>
 
int main() {
    int number, hours;
    float hourValue;
    scanf("%d", &number);
    scanf("%d", &hours);
    scanf("%f", &hourValue);

    printf("NUMBER = %d\nSALARY = U$ %.2f\n", number, (hourValue*hours));
    return 0;
}
