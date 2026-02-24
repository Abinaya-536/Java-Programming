import java.util.Scanner;

public class MovieAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int id = sc.nextInt(); 

        if (age >= 18 && id == 1) {
            System.out.println("Entry Allowed");
        } else {
            System.out.println("Entry Denied");
        }

        sc.close();
    }
}