import java.util.Scanner;

public class L_PrimeNumbersInRange {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter any number : ");
        int n=sc.nextInt();

        primeInRange(n);
    }

    public static void primeInRange(int n) {
        if (n <= 1) {
            System.out.println("Try again!!");
        } else {
            System.out.println("Prime numbers up to " + n + " are:");
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    

