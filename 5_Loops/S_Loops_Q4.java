import java.util.Scanner;

public class S_Loops_Q4 {
    // Write a program to print the multiplication table of a number N, entered by the
    // user.

public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter any Number: ");
    int n=sc.nextInt();
    table(n);
}

public static void table(int n){
    for(int i=1;i<=10;i++){
        System.out.println(n + " * " + i + " = " + (n*i));
    }
}
}
