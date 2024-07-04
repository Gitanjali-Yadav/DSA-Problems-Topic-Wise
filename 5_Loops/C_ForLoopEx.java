import java.util.Scanner;

public class C_ForLoopEx {
    public static void main(String[] args) {
        
        //print hello for 10 times
        for(int i=1;i<=10;i++){
            System.out.println(i+ ": Hello");
        }

        //print 1 to 50 numbers

        for(int i=1;i<=50;i++){
            System.out.println(i);
        }

        //print 1 to n numbers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        //print sum of 1 to n natural numbers
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<=num;i++){

            sum=sum+i;
        }
        System.out.println("sum = "+sum);


    }
}
