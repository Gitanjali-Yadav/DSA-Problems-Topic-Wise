import java.util.Scanner;

public class M_Functions_Q2 {
    public static void main(String[] args) {
        //Write a method named isEven that accepts an int argument. The method
        //should return true if the argument is even, or false otherwise. Also write a program to test your

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();

        System.out.println(isEven(n));
    }

    public static boolean isEven(int n){
        return (n%2==0);
    }
}
