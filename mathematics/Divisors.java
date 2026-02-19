package mathematics;

import java.util.Scanner;

public class Divisors {

    public static void printDivisors(int n) {

   
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }


        for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print(n / i + " ");
            }
        }
    
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Divisors of " + num );
        printDivisors(num);

        sc.close();
    }
}   
