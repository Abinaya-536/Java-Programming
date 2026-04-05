import java.util.Scanner;

public class EvenOdd {
    static String checkEvenOdd(int n) {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkEvenOdd(n));
    }
}
