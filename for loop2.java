import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int total = 0;
        int high = 0;
        int pass = 0;
        int fail = 0;

        for(int i = 1; i <= n; i++) {

            String name = sc.next();
            int score = sc.nextInt();

            char grade;

            if(score >= 85) {
                grade = 'A';
            }
            else if(score >= 70) {
                grade = 'B';
            }
            else if(score >= 60) {
                grade = 'C';
            }
            else if(score >= 50) {
                grade = 'D';
            }
            else {
                grade = 'F';
            }

            String status;

            if(score >= 60) {
                status = "Pass";
                pass++;
            } 
            else {
                status = "Fail";
                fail++;
            }

            if(score > high) {
                high = score;
            }

            total = total + score;

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = (double) total / n;

        System.out.println("Total Students: " + n);
        System.out.println("Class Average: " + String.format("%.2f", avg));
        System.out.println("Highest Score: " + high);
        System.out.println("Students Passed: " + pass);
        System.out.println("Students Failed: " + fail);

    }
}
