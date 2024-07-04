import java.util.Scanner;

public class B_Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Before Swapping  = \n n1 = " + n1 + " \n n2 = "  + n2);

        swap(n1, n2);
    }

    public static void swap(int n1, int n2){


        int temp;
        temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("After Swapping  = \n n1 = " + n1 + " \n n2 = "  + n2);
    }
}
