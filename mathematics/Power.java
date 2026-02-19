package mathematics;

public class Power {

    public static long power(long x, long n) {
        if (n == 0)
            return 1;
        long temp = power(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0){
             return temp;
        }
        else{
            return temp * x;
        }
    }

    public static void main(String[] args) {

        long x = 2;
        long n = 5;

        System.out.println("Result: " + power(x, n));
    }
}
