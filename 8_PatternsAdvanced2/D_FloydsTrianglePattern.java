public class D_FloydsTrianglePattern {
    public static void main(String[] args) {
        printPattern(10);
    }
    public static void printPattern(int n){
       int counter=1;

       for(int line=1;line<=n;line++){
        for(int num=1;num<=line;num++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
       }
    }
}
