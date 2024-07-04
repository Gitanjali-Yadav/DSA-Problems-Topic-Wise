import java.util.Scanner;

public class M_SwitchCase {
    public static void main(String[] args) {
        //Write a Java program to input week number(1-7) and print day of week name
// using switch case.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between (1-7) :- ");
        int num=sc.nextInt();

        switch(num){
            case 1:System.out.println("1 : Monday");break;
            case 2:System.out.println("2 : Tuesday");break;
            case 3:System.out.println("3 : Wednesday");break;
            case 4:System.out.println("4 : Thursday");break;
            case 5:System.out.println("5 : Friday");break;
            case 6:System.out.println("6 : Saturday");break;
            case 7:System.out.println("7 : Sunday");break;
            default : System.out.println("Invalid Input");
        } 
    }
}
