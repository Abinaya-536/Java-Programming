#include <stdio.h>

int main() {
    int fuel;
    int N;

    scanf("%d", &fuel);
    scanf("%d", &N);

    int i = 1;
    int burn;
    int emergencyStage = -1;
    int fuelWasted = 0;

    while (i <= N) {
        scanf("%d", &burn);

        fuel = fuel - burn;

        if (fuel < 0 && emergencyStage == -1) {
            emergencyStage = i;
            fuelWasted = -fuel;   
        }

        i++;
    }

    if (emergencyStage == -1) {
        printf("Emergency Stage: Not Occurred\n");
        printf("Fuel Wasted: 0\n");
    } else {
        printf("Emergency Stage: %d\n", emergencyStage);
        printf("Fuel Wasted: %d\n", fuelWasted);
    }

    return 0;
}
