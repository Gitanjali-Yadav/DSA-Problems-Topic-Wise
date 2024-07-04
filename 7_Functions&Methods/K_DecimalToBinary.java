import java.util.Scanner;

public class K_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter any Decimal NUmber : ");
        int decNum=sc.nextInt();

        System.out.println("Decimal Number = " + decNum);
        System.out.println("Binary Converted Number = " + binaryConversion(decNum));
    }

    public static int binaryConversion(int n){
        int binaryNum=0;
        int pow=0;

        while(n>0){
            int rem=n%2;
            binaryNum=(binaryNum+(rem*(int)Math.pow(10, pow)));
            pow++;
            n=n/2;
        }
        return binaryNum;
    }
}
