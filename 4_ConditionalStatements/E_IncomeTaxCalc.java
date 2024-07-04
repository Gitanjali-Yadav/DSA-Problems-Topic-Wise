import java.util.Scanner;

public class E_IncomeTaxCalc {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter your Yearly Income : - ");
        System.out.println("####################################");

        Double user_income = sc.nextDouble();

        Double tax;

        if(user_income<500000){
            tax=0.0;
        }else if(user_income >= 500000 && user_income < 1000000){
            tax=0.2;
        }else{
            tax=0.3;
        }

        System.out.println("Liable Tax : " + tax);
        System.out.println("Total Amount Deduction : " + (user_income * tax));

    }
}
