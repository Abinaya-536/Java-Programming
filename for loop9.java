import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalDuration = 0;
        int totalCalories = 0;

        for(int i = 1; i <= n; i++)
        {
            String exercise = sc.next();
            int minutes = sc.nextInt();

            int calories = 0;
            String intensity = "";

            if(exercise.equals("Running"))
            {
                calories = minutes * 10;
                intensity = "High";
            }
            else if(exercise.equals("Swimming"))
            {
                calories = minutes * 12;
                intensity = "High";
            }
            else if(exercise.equals("Cycling"))
            {
                calories = minutes * 8;
                intensity = "Moderate";
            }
            else if(exercise.equals("Gym"))
            {
                calories = minutes * 7;
                intensity = "Moderate";
            }
            else if(exercise.equals("Walking"))
            {
                calories = minutes * 4;
                intensity = "Low";
            }

            System.out.println("Session " + i + ": " + exercise);
            System.out.println("Duration: " + minutes + " minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity: " + intensity);
            System.out.println();

            totalDuration += minutes;
            totalCalories += calories;
        }

        double avg = (double) totalCalories / n;

        String level;

        if(totalCalories < 300)
            level = "Beginner";
        else if(totalCalories <= 1000)
            level = "Intermediate";
        else
            level = "Advanced";

        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.println("Average Calories per Session: " + avg);
        System.out.println("Fitness Level: " + level);

        sc.close();
    }
}
