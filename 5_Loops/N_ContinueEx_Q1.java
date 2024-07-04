import java.util.Scanner;

public class N_ContinueEx_Q1 {
    public static void main(String[] args) {
        
        //display all numbers entered by user except the multiples of 10;

        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("enter n : ");
            int n=sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("num = "+n);

        }while(true);
    }
}
