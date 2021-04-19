#include <stdio.h>
 
int main() {
    char name[50];
    double fixSalary, sales;
    scanf("%s", name);
    scanf("%lf", &fixSalary);
    scanf("%lf", &sales);

    double extra = sales * 0.15;

    printf("TOTAL = R$ %.2lf\n", (fixSalary + extra));
    return 0;
}
