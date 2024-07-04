import java.util.Scanner;

public class E_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of " + n + " is " + calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
