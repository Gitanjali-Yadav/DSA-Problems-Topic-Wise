import java.util.Scanner;

public class K_BreakAdv_Q1 {
    public static void main(String[] args) {
        
        //keep entering numbers till user enters a multiple of 10;

        boolean flag=false;

        Scanner  sc=new Scanner(System.in);

        do{
          System.out.println("Enter a number : ");
          int n=sc.nextInt();

          if(n%10!=0){
            flag=false;
          }else{
            flag=true;
            break;
          }

          if(flag!=true){
            System.out.println("Number = " + n);
          }

        }while(true);

        System.out.println("Exiting ###");
    }
}
