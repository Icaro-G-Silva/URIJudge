#include <stdio.h>
 
int main() {
    double A, B;
    scanf("%lf", &A);
    scanf("%lf", &B);

    double avg = ((A*3.5)+(B*7.5))/11;

    printf("MEDIA = %.5f\n", avg);
    return 0;
}
