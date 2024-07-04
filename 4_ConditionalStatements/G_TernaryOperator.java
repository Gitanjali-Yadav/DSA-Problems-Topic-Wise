import java.util.Scanner;

public class G_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number = ");
        int n=sc.nextInt();

        System.out.println(((n%2)==0)?"even":"odd");

        String res=((n%2)==0)?"even":"odd";
        
    }
}
