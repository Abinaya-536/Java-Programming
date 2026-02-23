import java.util.Scanner;

public class PermissionMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int permissionA = sc.nextInt();
        int permissionB = sc.nextInt();

        int merged = permissionA | permissionB;

        System.out.println("Merged Permission Code = " + merged);

        sc.close();
    }
}