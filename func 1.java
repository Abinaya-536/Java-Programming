import java.util.Scanner;

public class SimpleInterest {
    static float calculateSI(int p, int r, int t) {
        return (p * r * t) / 100.0f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        float si = calculateSI(p, r, t);
        System.out.printf("%.2f", si);
    }
}
