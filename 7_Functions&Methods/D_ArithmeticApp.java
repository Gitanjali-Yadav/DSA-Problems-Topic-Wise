import java.util.Scanner;

public class D_ArithmeticApp {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        sum(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
        mod(a, b);
        
    }

    public static void sum(int n1, int n2){
        System.out.println("Sum = " + (n1+n2));
    }
    public static void sub(int n1, int n2){
        System.out.println("Difference = " + (n1-n2));
    }
    public static void mul(int n1, int n2){
        System.out.println("Product = " + (n1*n2));
    }
    public static void div(int n1, int n2){
        System.out.println("Quotient = " + (n1/n2));
    }
    public static void mod(int n1, int n2){
        System.out.println("Remainder = " + (n1%n2));
    }
}
