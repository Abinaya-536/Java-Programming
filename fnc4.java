import java.util.Scanner;

public class CircleArea {
    static float calculateArea(int r) {
        return 3.14f * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        float area = calculateArea(r);
        System.out.printf("%.2f", area);
    }
}
