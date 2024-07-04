public class D_SquarePattern {
    public static void main(String[] args) {
        
        int lines=4;

        for(int i=1;i<=lines;i++){
            System.out.println(" * * * * ");
        }

        System.out.println("##############################");
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
