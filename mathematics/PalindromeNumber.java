package mathematics;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is palindrome or not");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        if (num < 0){
            System.out.println("not palindrome");
        }else{
            while (num > 0){
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num/10;
    

            }
            if (original == reverse){
                System.out.println(" Palindrome");

            }else{
                System.out.println("not palindrome");

            }
        }
    }
    
}
