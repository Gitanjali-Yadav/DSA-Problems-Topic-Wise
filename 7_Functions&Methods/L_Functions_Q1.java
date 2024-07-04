import java.util.Scanner;

public class L_Functions_Q1 {
    public static void main(String[] args) {
        // Write a Java method to compute the average of three numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        System.out.println("Average = " + calculateAverage(n1, n2, n3));

    }

    public static double calculateAverage(int n1, int n2, int n3){
        return ((n1+n2+n3)/3.0);
    }
}
