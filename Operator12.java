import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fileSize = sc.nextInt();
        int cycles = sc.nextInt();

        int size = fileSize >> cycles;

        System.out.println("Compressed Size = " + size);

        sc.close();
    }
}