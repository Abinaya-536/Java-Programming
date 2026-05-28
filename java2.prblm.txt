#include <stdio.h>

int main() {
    float baseCost, extraGB, ratePerGB, taxPercent;
    float extraCharge, total, finalBill;

    scanf("%f %f %f %f", &baseCost, &extraGB, &ratePerGB, &taxPercent);

    extraCharge = extraGB * ratePerGB;


    total = baseCost + extraCharge;


    finalBill = total + (total * taxPercent / 100);


    printf("Total Bill = %.2f", finalBill);

    return 0;
}
