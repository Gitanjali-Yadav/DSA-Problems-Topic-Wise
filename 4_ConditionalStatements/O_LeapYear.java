import java.util.Scanner;

public class O_LeapYear {

    // Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.
//hint : If a year is evenly divisible by 4, 100, and 400, then it is a leap year.

// If a year is divisible by 4 but not divisible by 100, it is a leap year.
// If a year is divisible by 100 but not divisible by 400, it is not a leap year.
// If a year is divisible by 400, it is a leap year.

 public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
        System.out.println(year + " is a leap year");
        } else {
        System.out.println(year + " is not a leap year");
        }

    }   
}
