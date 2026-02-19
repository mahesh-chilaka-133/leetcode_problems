package mathematics;

import java.util.Scanner;

public class Sieve {

    public static void sieve(int n) {

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }

        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        sieve(n);

        sc.close();
    }
}
