import java.util.Scanner;
// Write a Java program to check if a number is a palindrome in Java? ( 121 is a
// palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

public class N_Functions_Q3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number : ");
        int num=sc.nextInt();

        System.out.println(isPalindrome(num)? "Palindrome":"Not Palindrome");
    }

    public static int reverseNum(int n){
        int reverse=0;
        while(n>0){
            int rem=n%10;
            reverse= ((reverse*10)+rem);
            n=n/10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int n){
        int reverseNum=reverseNum(n);

        return (reverseNum==n);
    }
}
