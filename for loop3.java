import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int low = 0;
        int critical = 0;
        int totalReorder = 0;

        for(int i = 1; i <= n; i++) {

            String name = sc.next();
            int current = sc.nextInt();
            int min = sc.nextInt();

            String status;
            int reorder = 0;

            if(current >= min) {
                status = "Adequate";
                reorder = 0;
            }
            else if(current < min && current >= min/2) {
                status = "Low Stock";
                reorder = (min - current) + (min / 2);
                low++;
            }
            else {
                status = "Critical";
                reorder = (int)((min - current) + (min * 1.5));
                critical++;
            }

            totalReorder = totalReorder + reorder;

            System.out.println("Product: " + name);
            System.out.println("Current Stock: " + current);
            System.out.println("Minimum Stock: " + min);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + reorder);
            System.out.println();
        }

        System.out.println("Total Products: " + n);
        System.out.println("Low Stock Items: " + low);
        System.out.println("Critical Items: " + critical);
        System.out.println("Total Reorder Quantity: " + totalReorder);
    }
}
