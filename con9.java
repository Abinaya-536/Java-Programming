import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double revenue = sc.nextDouble();
        sc.nextLine();  
        String type = sc.nextLine();
        double expenses = sc.nextDouble();
        double credits = sc.nextDouble();

        double taxable = revenue - expenses;
        double rate = 0;

       
        if (type.equals("C-Corp")) {
            if (taxable < 500000)
                rate = 21;
            else if (taxable <= 1000000)
                rate = 24;
            else if (taxable <= 2000000)
                rate = 28;
            else
                rate = 30;
        } 
        else if (type.equals("S-Corp")) {
            if (taxable < 500000)
                rate = 20;
            else if (taxable <= 1000000)
                rate = 25;
            else
                rate = 28;
        } 
        else if (type.equals("LLC")) {
            if (taxable < 200000)
                rate = 15;
            else if (taxable <= 500000)
                rate = 18;
            else
                rate = 22;
        } 
        else if (type.equals("Partnership")) {
            if (taxable < 300000)
                rate = 18;
            else if (taxable <= 800000)
                rate = 22;
            else
                rate = 26;
        }

        double gross = taxable * rate / 100;
        double net = gross - credits;

        if (net < 0)
            net = 0;

        double effective = (net / revenue) * 100;
        System.out.println("Annual Revenue: $" + revenue);
        System.out.println("Business Type: " + type);
        System.out.println("Deductible Expenses: $" + expenses);
        System.out.println("Tax Credits: $" + credits);
        System.out.println("Taxable Income: $" + taxable);
        System.out.println("Tax Rate: " + (int)rate + "%");
        System.out.println("Gross Tax: $" + gross);
        System.out.println("Net Tax After Credits: $" + net);
        System.out.printf("Effective Tax Rate: %.2f%%", effective);

        sc.close();
    }
}
