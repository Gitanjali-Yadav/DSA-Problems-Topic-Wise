import java.util.Scanner;

public class J_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter any Binary NUmber : ");
        int binNum=sc.nextInt();

        System.out.println("Binary Number = " + binNum);
        System.out.println("Decimal Converted Number = " + decimalConversion(binNum));

    }

    public static int decimalConversion(int n){

        int decimal=0;
        int pow=0;

        while(n>0){
            int lastdigit=n%10;
            decimal=(decimal+(lastdigit*(int)Math.pow(2, pow)));
            pow++;
            n=n/10;
        }
        return decimal;
    }
}
