import java.util.Scanner;
// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

public class O_Functions_Q5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter any Number : ");
        int a=sc.nextInt();

        System.out.println("Sum od Digits = " + calculateSum(a));

    }

    public static int calculateSum(int n){
        int lastdigit=0;
        int sum=0;
        while(n>0){
            lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }
}
