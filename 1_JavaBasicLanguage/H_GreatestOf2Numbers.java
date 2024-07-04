import java.util.Scanner;

public class H_GreatestOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter any 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}
