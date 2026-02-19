package mathematics;

import java.util.Scanner;

public class Lcm {

       public static int gcd(int a , int b) {

        if (b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }

        public static int lcm(int a, int b) {
            return (a*b)/gcd(a,b);
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second  number ");
        int num2 = sc.nextInt();

        System.out.println("Lcm of " + num1 + " and " + num2 + " is " + lcm(num1,num2) );
        sc.close();
    }

}
