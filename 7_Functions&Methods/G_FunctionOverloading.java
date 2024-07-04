import java.util.Scanner;

public class G_FunctionOverloading {
    public static void main(String[] args) {
        main();
        
    }

    public static void main() {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter any two numbers : ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        
        System.out.println("Addition = " + add(5.2,4.8));
    }

    public static int add(int a , int b) {
        return a+b;
    }

    public static double add(double a , double b) {
        return a+b;
    }

    public static long add(long a , long b) {
        return a+b;
    }
}
