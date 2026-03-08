import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        double total = 0;

        for(int i = 1; i <= n; i++) {

            String name = sc.next();
            double salary = sc.nextDouble();
            int rating = sc.nextInt();

            int inc = 0;

            if(rating == 5) {
                inc = 15;
            }
            else if(rating == 4) {
                inc = 10;
            }
            else if(rating == 3) {
                inc = 5;
            }
            else if(rating == 2) {
                inc = 2;
            }
            else {
                inc = 0;
            }

            double finalSalary = salary + (salary * inc / 100);

            total = total + finalSalary;

            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + salary);
            System.out.println("Performance Rating: " + rating);
            System.out.println("Increment: " + inc + "%");
            System.out.println("Final Salary: $" + finalSalary);
            System.out.println();
        }

        double avg = total / n;

        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + total);
        System.out.println("Average Salary: $" + String.format("%.2f", avg));

    }
}
