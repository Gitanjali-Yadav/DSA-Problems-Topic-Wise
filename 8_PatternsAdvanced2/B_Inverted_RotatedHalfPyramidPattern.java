public class B_Inverted_RotatedHalfPyramidPattern {
    public static void main(String[] args) {
        printPattern(4);
    }
    public static void printPattern(int n){

       for(int i=1;i<=n;i++){
        for(int sp=1;sp<=n-i;sp++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
