import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        int rating = sc.nextInt();
        int years = sc.nextInt();
        sc.nextLine(); 
        String dept = sc.nextLine();
        double salary = sc.nextDouble();

        int percent = 0;
        String result = "Not Eligible";


        if (rating >= 3) {
            result = "Eligible";

            if (dept.equalsIgnoreCase("Critical")) {

                if (rating == 5 && years >= 5) {
                    percent = 25;
                } 
                else if (rating == 4 && years >= 10) {
                    percent = 22;
                } 
                else if (rating == 4) {
                    percent = 15;
                } 
                else if (rating == 3) {
                    percent = 10;
                }

            } else if (dept.equalsIgnoreCase("Non-Critical")) {

                if (rating == 5) {
                    percent = 18;
                } 
                else if (rating == 4) {
                    percent = 12;
                } 
                else if (rating == 3) {
                    percent = 8;
                }
            }
        }

        double bonus = salary * percent / 100.0;

  
        System.out.println("Performance Rating: " + rating);
        System.out.println("Years of Service: " + years);
        System.out.println("Department: " + dept);
        System.out.println("Bonus Percentage: " + percent + "%");
        System.out.println("Bonus Amount: $" + bonus);
        System.out.println("Status: " + result);

        sc.close();
    }
}