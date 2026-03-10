import java.util.Scanner;

public class QuizScoreCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int passCount = 0;
        int failCount = 0;
        int highestScore = 0;
        int totalScore = 0;

        for(int i = 1; i <= n; i++)
        {
            String name = sc.next();
            int correct = sc.nextInt();
            int wrong = sc.nextInt();
            int unattempted = sc.nextInt();

            int score = (correct * 4) - (wrong * 3);

            totalScore += score;

            if(score > highestScore)
                highestScore = score;

            System.out.println("Student: " + name);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong: " + wrong);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);

            if(score >= 32)
            {
                System.out.println("Result: Pass");
                passCount++;
            }
            else
            {
                System.out.println("Result: Fail");
                failCount++;
            }

            System.out.println();
        }

        double average = (double) totalScore / n;

        System.out.println("Total Students: " + n);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + average);
        System.out.println("Highest Score: " + highestScore);
    }
}
