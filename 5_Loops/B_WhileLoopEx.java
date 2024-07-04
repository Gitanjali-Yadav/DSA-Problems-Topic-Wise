import java.util.Scanner;

public class B_WhileLoopEx {
    public static void main(String[] args) {
        
        //print hello 100 times

        int i=1;
        while(i<=100){
            System.out.println(i + ": Hello");
            i++;
        }
        //print 1 to n numbers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        int j=1;
        while(j<=n){
            System.out.println(j);
            j++;
        }

        //print sum of 1 to n numbers

        
        System.out.println("Enter num : ");
        int num=sc.nextInt();

        int k=1;
        int sum=0;
        while(k<=n){
            sum=sum+k;
            k++;
        }
        System.out.println("Sum = " + sum);
    }
}
