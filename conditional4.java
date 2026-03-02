import java.util.Scanner;

public class con4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine(); 
        String scholarshipType = sc.nextLine();

        boolean eligible = false;
        double awardAmount = 0.0;
        String awardCategory = "None";

               if (gpa >= 2.5) {

            if (scholarshipType.equals("Merit")) {

                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    eligible = true;
                    awardAmount = 25000.0;
                    awardCategory = "Full";
                } 
                else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    eligible = true;
                    awardAmount = 15000.0;
                    awardCategory = "Partial";
                } 
                else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    eligible = true;
                    awardAmount = 8000.0;
                    awardCategory = "Minimal";
                }

            } 
            else if (scholarshipType.equals("Need-Based")) {

                if (familyIncome <= 30000 && gpa >= 3.5) {
                    eligible = true;
                    awardAmount = 30000.0;
                    awardCategory = "Full";
                } 
                else if (familyIncome <= 50000 && gpa >= 3.0) {
                    eligible = true;
                    awardAmount = 18000.0;
                    awardCategory = "Partial";
                } 
                else if (familyIncome <= 70000 && gpa >= 2.8) {
                    eligible = true;
                    awardAmount = 10000.0;
                    awardCategory = "Minimal";
                }

            } 
            else if (scholarshipType.equals("Sports")) {

                if (extracurricularScore >= 85 && gpa >= 3.0) {
                    eligible = true;
                    awardAmount = 22000.0;
                    awardCategory = "Full";
                } 
                else if (extracurricularScore >= 75 && gpa >= 2.8) {
                    eligible = true;
                    awardAmount = 20000.0;
                    awardCategory = "Partial";
                } 
                else if (extracurricularScore >= 65 && gpa >= 2.5) {
                    eligible = true;
                    awardAmount = 12000.0;
                    awardCategory = "Minimal";
                }
            }
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);

        if (eligible) {
            System.out.println("Eligibility: Eligible");
            System.out.println("Award Amount: $" + awardAmount);
            System.out.println("Award Category: " + awardCategory);
        } else {
            System.out.println("Eligibility: Not Eligible");
            System.out.println("Award Amount: $0.0");
            System.out.println("Award Category: None");
        }

        sc.close();
    }
}