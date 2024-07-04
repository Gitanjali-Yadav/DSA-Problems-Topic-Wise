import java.util.Scanner;

public class H_TernaryOperator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks = ");
        int marks=sc.nextInt();

        System.out.println((marks>=35)?"Pass":"Fail");

        String res=(marks>=35)?"Pass":"Fail";
    }
}
