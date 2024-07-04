import java.util.Scanner;

public class O_PrimeNumEx {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n=sc.nextInt();

        //corner case 1 :  2 is prime

        if(n==2){
            System.out.println(n + " is Prime");
        }else{
            boolean flag=false;

            for(int i=2;i<=n-1;i++){
                //check if number is the multiple of numbers other than 1 & number itself
                if(n%i==0){
                    flag=true;
                }
            }

            if(flag!=true){
                System.out.println(n + " is Prime");
            }else{
                System.out.println(n + " is not Prime");
            }

        }

        sc.close();
        

    }
}
