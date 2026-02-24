import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int percentage = sc.nextInt();

        if (income < 200000 && percentage >= 75) {
            System.out.println("Granted");
        } else {
            System.out.println("Not Granted");
        }

        sc.close();
    }
}