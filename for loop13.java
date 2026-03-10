import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int eligible = 0;
        int rejected = 0;

        for(int i = 1; i <= n; i++)
        {
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();

            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");

            if(age < 18)
            {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: Age below 18 years");
                rejected++;
            }
            else if(age > 65)
            {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: Age above 65 years");
                rejected++;
            }
            else if(weight < 50)
            {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: Weight below 50 kg");
                rejected++;
            }
            else if(hemoglobin < 12.5)
            {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: Hemoglobin below 12.5 g/dL");
                rejected++;
            }
            else
            {
                System.out.println("Status: Eligible");
                eligible++;
            }

            System.out.println();
        }

        double rate = (eligible * 100.0) / n;

        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + eligible);
        System.out.println("Rejected Donors: " + rejected);
        System.out.println("Eligibility Rate: " + rate + "%");
    }
}
