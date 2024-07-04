import java.util.Scanner;

public class H_isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        System.out.println(isPrime(n)? "It is Prime":"It is not Prime");
    }

    public static boolean isPrime(int n){
        //corner case-> if n<2 , it is not prime
        //corner case-> if n==2, it is prime

        // Numbers less than 2 are not prime
        if(n<2){
            return false;
        }
        // Check for factors from 2 to the square root of n
        //for(int i=2; i<=n-1;i++){
        // for(int i=2;i*i<=n;i++){//this approach is considered optimal
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        // If no factors are found, n is prime
        return true;
    }
}
