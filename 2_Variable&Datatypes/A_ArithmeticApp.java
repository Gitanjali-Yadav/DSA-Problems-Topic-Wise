import java.util.Scanner;

public class A_ArithmeticApp {

    public static void main(String[] args) {
        A_ArithmeticApp a_ArithmeticApp=new A_ArithmeticApp();
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        add(a, b);
        a_ArithmeticApp.sub(a, b);
        System.out.println("Multiplication Result = "+mul(a, b));
        System.out.println("Division Result = "+ a_ArithmeticApp.div(a, b));


    }

    public static void add(int a, int b){
        System.out.println("Addition Result = "+(a+b));
    }

    public void sub(int a, int b){
        System.out.println("Subtraction Result = "+(a-b));
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public double div(int a, int b){
        return a/b;
    }

}