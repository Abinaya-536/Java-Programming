import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();      
        String loyalty = sc.nextLine();  
        double amount = sc.nextDouble();  
        sc.nextLine();
        String time = sc.nextLine();    

        double discount = 0;
        double fee = 0;
        String priority;
        int prepTime;

      
        if (loyalty.equals("Gold"))
            discount = 15;
        else if (loyalty.equals("Silver"))
            discount = 10;
        else if (loyalty.equals("Bronze"))
            discount = 5;
        else
            discount = 0;

        
        if (time.equals("Late-Night"))
            discount = discount + 5;

      
        if (type.equals("Delivery"))
            fee = amount * 0.10;
        else if (type.equals("Takeout"))
            fee = amount * 0.03;
        else
            fee = 0;

      
        double finalAmount = amount - (amount * discount / 100) + fee;

        
        if (time.equals("Peak") && type.equals("Delivery")) {
            priority = "High";
            prepTime = 25;
        } else if (time.equals("Late-Night")) {
            priority = "Low";
            prepTime = 15;
        } else {
            priority = "Medium";
            prepTime = 20;
        }

        
        System.out.println("Order Type: " + type);
        System.out.println("Loyalty Status: " + loyalty);
        System.out.println("Order Value: $" + amount);
        System.out.println("Time Slot: " + time);
        System.out.println("Base Discount: " + discount + "%");
        System.out.println("Service Fee: $" + fee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}
