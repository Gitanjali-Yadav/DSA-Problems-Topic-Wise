import java.util.Scanner;

public class C_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value Principle Amount : ");
        int p=sc.nextInt();

        System.out.println("Enter the Rate of Interest : ");
        int r=sc.nextInt();

        System.out.println("Enter the Time in Years : ");
        int n=sc.nextInt();

        double simpleInterest = (p*r*n)/100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}
