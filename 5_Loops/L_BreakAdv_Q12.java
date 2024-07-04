import java.util.Scanner;

public class L_BreakAdv_Q12 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        boolean flag=false;

        do{
            System.out.println("Enter a num : ");
            int n=sc.nextInt();

            if(n%10==0){
                flag=true;
            }else{
                System.out.println("Num= " + n);
            }
        }while(!flag);
    }
}
