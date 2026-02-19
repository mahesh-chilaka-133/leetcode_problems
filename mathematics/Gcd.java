package mathematics;

import java.util.Scanner;

public class Gcd {

    public static int gcd(int a , int b) {

        if (b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }

    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second  number ");
        int num2 = sc.nextInt();

        System.out.println("Gcd of " + num1 + " and " + num2 + " is " + gcd(num1,num2) );
        sc.close();
     }
    
}
