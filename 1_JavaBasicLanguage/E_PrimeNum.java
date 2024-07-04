import java.util.Scanner;

public class E_PrimeNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter any number : ");
        int n=sc.nextInt();
        
        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n){
        boolean status=false;

        if(n>=2){
            if(n%2==0){
                status=true;
            }else{
                status=false;
            }
        }else if(n==0 || n==1){
            status=false;
        }
        return status;
    }
}
