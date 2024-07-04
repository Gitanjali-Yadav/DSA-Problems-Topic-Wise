public class I_DiamondPattern {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
