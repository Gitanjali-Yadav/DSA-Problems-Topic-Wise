import java.util.Scanner;

public class J_ArithmeticApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any 2 number : ");
        System.out.println("###############################");

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("Entered numbers are : \n n1= " + n1 + "\n n2 = " + n2);
        System.out.println("###############################");

        boolean flag=false;
        do{
        System.out.println("Which Operation would you like to perform on the Numbers (+,-,*,/,%): \n (e.g. type '+' for addition)");

        char ch=sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Addition result = " + (n1+n2));
                break;

                case '-':
                System.out.println("Subtraction result = " + (n1-n2));

                break;

                case '*':
                System.out.println("Multiplication result = " + (n1*n2));

                break;

                case '/':
                System.out.println("Division result = " + (n1/n2));

                break;
        
            default:
            System.out.println("Invalid Choice !");

        }
        flag=true;
    }while(flag);
    }
}
