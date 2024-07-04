import java.util.Scanner;

public class D_IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age=sc.nextInt();


        if(age>=18){
            System.out.println("Eligible !!");
        }else if(age<18 && age>=13){
            System.out.println("teenage");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
