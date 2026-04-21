#include <stdio.h>

int main() {
    float sales, discountPercent, gstPercent;
    float discountAmount, amountAfterDiscount, gstAmount, finalRevenue;
    scanf("%f %f %f", &sales, &discountPercent, &gstPercent);


    discountAmount = sales * discountPercent / 100;
    amountAfterDiscount = sales - discountAmount;

    gstAmount = amountAfterDiscount * gstPercent / 100;
    finalRevenue = amountAfterDiscount + gstAmount;


    printf("Final Revenue = %.2f", finalRevenue);

    return 0;
}
