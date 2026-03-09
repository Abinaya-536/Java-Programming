import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalUnits = 0;
        double totalRevenue = 0;

        for(int i = 1; i <= n; i++)
        {
            String id = sc.next();
            int units = sc.nextInt();

            double bill = 0;

            if(units <= 100)
            {
                bill = units * 0.10;
            }
            else if(units <= 200)
            {
                bill = (100 * 0.10) + (units - 100) * 0.13;
            }
            else if(units <= 300)
            {
                bill = (100 * 0.10) + (100 * 0.13) + (units - 200) * 0.16;
            }
            else
            {
                bill = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + (units - 300) * 0.20;
            }

            String category;

            if(units <= 200)
                category = "Low Usage";
            else if(units <= 300)
                category = "Medium Usage";
            else
                category = "High Usage";

            System.out.println("Consumer ID: " + id);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount: $" + bill);
            System.out.println("Category: " + category);
            System.out.println();

            totalUnits += units;
            totalRevenue += bill;
        }

        double average = totalRevenue / n;

        System.out.println("Total Consumers: " + n);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Bill: $" + average);

        sc.close();
    }
}
