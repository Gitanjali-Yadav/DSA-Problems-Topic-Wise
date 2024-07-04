import java.util.Scanner;

public class E_ReverseNumberBasic {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number : ");

        int n=sc.nextInt();

        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
