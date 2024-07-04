import java.util.Scanner;

public class M_BreakAdv_Q123 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a Number : ");

            int n = sc.nextInt();
          
            if(n%10==0){
                break;
            }
            System.out.println("Num = " + n);

        }while(true);


    }
}
