import java.util.Scanner;

public class con12{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String vehicle = sc.nextLine();
        String record = sc.nextLine();
        String coverage = sc.nextLine();

        double base = 0;
        double ageFactor = 1;
        double vehicleFactor = 1;
        int recordPercent = 0;

       
        if (coverage.equals("Basic"))
            base = 500;
        else if (coverage.equals("Standard"))
            base = 800;
        else
            base = 1500;

        
        if (age <= 21)
            ageFactor = 1.8;
        else if (age <= 25)
            ageFactor = 1.5;
        else if (age <= 40)
            ageFactor = 1.0;
        else if (age <= 60)
            ageFactor = 0.9;
        else
            ageFactor = 1.1;

       
        if (vehicle.equals("Sedan"))
            vehicleFactor = 1.0;
        else if (vehicle.equals("SUV"))
            vehicleFactor = 1.2;
        else if (vehicle.equals("Sports"))
            vehicleFactor = 1.5;
        else
            vehicleFactor = 1.1;

        
        if (record.equals("Clean"))
            recordPercent = -10;
        else if (record.equals("Minor-Violations"))
            recordPercent = 25;
        else
            recordPercent = 50;

        
        double amount = base * ageFactor * vehicleFactor;
        amount = amount + (amount * recordPercent / 100);
        double monthly = amount / 12;

     
        System.out.println("Driver Age: " + age);
        System.out.println("Vehicle Type: " + vehicle);
        System.out.println("Driving Record: " + record);
        System.out.println("Coverage Level: " + coverage);
        System.out.println("Monthly Premium: $" + monthly);
        System.out.println("Annual Premium: $" + amount);
    }
}
