import java.util.Scanner;

public class D_Maxof3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter 3 numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(calculateMax(a, b, c));

        // if(a>=b && a>=c){
        //     System.out.println(a);
        // }else if(b>=a && b>=c){
        //     System.out.println(b);
        // }else{
        //     System.out.println(c);
        // }
    }

    public static int calculateMax(int a, int b, int c){
        int max=0;

        if(a>b){
            if(a>c){
                max=a;
            }else{
                max=c;
            }
        }else if(b>c){
            max=b;
        }else{
            max=c;
        }

        return max;
    }
}
