import java.util.Scanner;

public class A_calculateSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any two numbers : ");

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Sum = " + calculateSum(n1, n2));
        //actual values or arguments
        

    }

    public static int calculateSum(int n1, int n2){
        //formal parameters
        return (n1+n2);
    }
}