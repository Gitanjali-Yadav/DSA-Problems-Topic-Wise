

// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

public class B_AvgOf3Numbers {
    public static void main(String[] args) {
        int a=20, b=30, c=40;
        System.out.println("Average = "+calcAvg(a, b, c));
    }

    public static int calcAvg(int a, int b, int c){
        return (a+b+c)/3 ;
    }
}
