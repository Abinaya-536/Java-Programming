import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalSales = 0;
        double totalCom = 0;
        double maxSales = 0;
        String top = "";

        for(int i = 1; i <= n; i++) {

            String name = sc.next();
            double sales = sc.nextDouble();

            int rate;

            if(sales <= 40000)
                rate = 5;
            else if(sales <= 80000)
                rate = 8;
            else if(sales <= 100000)
                rate = 10;
            else if(sales <= 150000)
                rate = 12;
            else
                rate = 15;

            double commission = sales * rate / 100;

            double bonus = 0;

            if(sales >= 150000)
                bonus = 3000;
            else if(sales >= 100000)
                bonus = 2000;

            double total = commission + bonus;

            if(sales > maxSales) {
                maxSales = sales;
                top = name;
            }

            totalSales = totalSales + sales;
            totalCom = totalCom + commission;

            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + sales);
            System.out.println("Commission Rate: " + rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + total);
            System.out.println();
        }

        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCom);
        System.out.println("Top Performer: " + top);
    }
}
