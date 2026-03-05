import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int u = sc.nextInt();      
        sc.nextLine();
        String t = sc.nextLine();  
        String s = sc.nextLine();
        int y = sc.nextInt();     

        double bp = 0;   
        double sf = 0;  
        double vd = 0;  
        double yd = 0;   

       
        if (t.equals("Standard"))
            bp = 60;
        else if (t.equals("Professional"))
            bp = 120;
        else
            bp = 200;

        
        if (u <= 50)
            vd = 0;
        else if (u <= 200)
            vd = 15;
        else if (u <= 500)
            vd = 20;
        else if (u <= 1000)
            vd = 25;
        else
            vd = 35;

        
        if (s.equals("Basic"))
            sf = 10;
        else if (s.equals("Priority"))
            sf = 30;
        else
            sf = 80;

        
        if (y == 1)
            yd = 0;
        else if (y == 2)
            yd = 5;
        else if (y == 3)
            yd = 10;
        else
            yd = 20;

       
        double price1 = bp - (bp * vd / 100);
        double price2 = price1 + sf;
        double perUser = price2 - (price2 * yd / 100);
        double totalYear = perUser * u;
        double totalContract = totalYear * y;

        String tier;
        if (u < 200)
            tier = "Small Business";
        else if (u <= 1000)
            tier = "Mid-Market";
        else
            tier = "Enterprise";

       
        System.out.println("User Count: " + u);
        System.out.println("License Type: " + t);
        System.out.println("Support Level: " + s);
        System.out.println("Contract Duration: " + y + " years");
        System.out.println("Base Price Per User: $" + bp);
        System.out.println("Volume Discount: " + (int)vd + "%");
        System.out.println("Support Fee Per User: $" + sf);
        System.out.println("Multi-Year Discount: " + (int)yd + "%");
        System.out.println("Annual Cost Per User: $" + perUser);
        System.out.println("Total Annual Cost: $" + totalYear);
        System.out.println("Total Contract Value: $" + totalContract);
        System.out.println("Pricing Tier: " + tier);

        sc.close();
    }
}
