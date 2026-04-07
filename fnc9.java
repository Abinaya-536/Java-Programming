import java.util.Scanner;

public class PalindromeNumber {
    static int reverse(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
