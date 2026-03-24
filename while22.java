import java.util.Scanner;

public class MultiplicationTableDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int range = sc.nextInt();

        int i = 1;

        System.out.println("Multiplication table of " + number + ":");

        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= range);

        sc.close();
    }
}
