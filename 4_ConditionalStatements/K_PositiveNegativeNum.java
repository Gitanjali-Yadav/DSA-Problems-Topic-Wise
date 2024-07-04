import java.util.Scanner;

public class K_PositiveNegativeNum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : ");
        System.out.println("###############################");

        int n=sc.nextInt();

        if(n<0){
            System.out.println("Negative Number");
        }else if(n>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Invalid or zero");
        }
    }
}
