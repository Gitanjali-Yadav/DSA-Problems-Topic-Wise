public class A_HollowRectanglePattern {

    public static void main(String[] args) {
        printPattern(5, 10);//arguments
    }

    public static void printPattern(int rows,int cols){
        //parameters of the method
        for(int i=1; i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}