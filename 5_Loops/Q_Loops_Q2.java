import java.util.Scanner;

public class Q_Loops_Q2 {
    
    // Write a program that reads a set of integers, and then prints the sum of the
    // even and odd integers.


public static void main(String[] args) {
    
    int number;
    int choice;

    int evenSum=0;
    int oddSum=0;

    Scanner sc=new Scanner(System.in);


    do{
        System.out.println("Enter any Number : ");
        number=sc.nextInt();

        if(number%2==0){
            evenSum+=number;
        }else{
            oddSum+=number;
        }

        System.out.println("Press 1 to continue or 0 to exit :  ");
        choice=sc.nextInt();

    }while(choice==1);

    System.out.println("Sum of even Numbers : " + evenSum);
    System.out.println("Sum of odd Numbers : " + oddSum);
}
}
