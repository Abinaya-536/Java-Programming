import java.util.Scanner;

public class SignalToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signalValue = sc.nextInt();
        int toggleMask = sc.nextInt();

        int result = signalValue ^ toggleMask;

        System.out.println("Toggled Signal = " + result);

        sc.close();
    }
}