import java.util.Scanner;

public class con7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();              
        String bp = sc.next();              
        double temp = sc.nextDouble();      
        sc.nextLine();                      
                String sev = sc.nextLine();      

        
        String[] parts = bp.split("/");
        int sys = Integer.parseInt(parts[0]);
        int dia = Integer.parseInt(parts[1]);

        String priority = "";
        int wait = 0;
        String action = "";

        
        if (hr < 50 || hr > 130 || sys > 180 || sys < 90 || 
            temp > 103 || temp < 96 || sev.equals("Life-Threatening")) {

            priority = "Critical";
            wait = 0;
            action = "Immediate Emergency Care";

        } else {
            if ((hr >= 50 && hr <= 60) || (hr >= 110 && hr <= 130) ||
                (sys >= 160 && sys <= 180) || (sys >= 90 && sys <= 100) ||
                (temp >= 101 && temp <= 103) || (temp >= 96 && temp <= 97) ||
                sev.equals("Severe")) {

                priority = "Urgent";
                
                if (hr < 60 || sys < 100) {
                    wait = 20;
                } else {
                    wait = 15;
                }

                action = "Priority Medical Attention";

            } else {
                if (sev.equals("Moderate")) {
                    priority = "Standard";
                    wait = 45;
                    action = "Standard Examination";
                } else {
                    priority = "Non-Urgent";
                    wait = 90;
                    action = "Routine Check-up";
                }
            }
        }
        System.out.println("Heart Rate: " + hr + " bpm");
        System.out.println("Blood Pressure: " + bp);
        System.out.println("Temperature: " + temp + "°F");
        System.out.println("Symptom Severity: " + sev);
        System.out.println("Triage Priority: " + priority);
        System.out.println("Estimated Wait Time: " + wait + " minutes");
        System.out.println("Recommended Action: " + action);

      
    }
}
