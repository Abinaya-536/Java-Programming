import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();  
        int pass = sc.nextInt();   
        int locked = sc.nextInt();  

        if (user == 1 && pass == 1 && ! (locked == 1)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}