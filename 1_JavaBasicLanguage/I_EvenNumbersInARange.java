import java.util.Scanner;

public class I_EvenNumbersInARange {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter n: ");

        int n=sc.nextInt();

        printeven(n);
    }

    public static void printeven(int n){
        for(int i=1;i<=n;i++){
            boolean check = isEven(i);
            if(check){
                System.out.println(i);
            }
        }
    }

    public static boolean isEven(int n)
{
return n%2==0;
}
}
