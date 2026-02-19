package mathematics;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean prime(int num){
        if (num == 1){
            return false;
        }
        if (num == 2 || num == 3){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for (int i = 5; i*i <= num; i++){
            if (num % i == 0){
                return false;
            }
       
        }
         return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
       int num = sc.nextInt();
      
       boolean result = prime(num);

        if (result) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

        sc.close();
    }
    
}
