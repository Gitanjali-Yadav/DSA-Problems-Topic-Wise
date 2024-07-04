public class C_InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        printPattern(10);
    }
    public static void printPattern(int n){

        for(int line=1;line<=n;line++){
            for(int num=1; num<=(n-line)+1;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
