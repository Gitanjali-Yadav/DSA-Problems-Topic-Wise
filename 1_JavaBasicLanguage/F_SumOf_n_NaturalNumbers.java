import java.util.Scanner;

public class F_SumOf_n_NaturalNumbers {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
    }

    public static int sum(int n){
        int sum=0;
        while(n>=1){
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
