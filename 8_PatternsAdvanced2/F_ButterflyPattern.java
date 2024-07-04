public class F_ButterflyPattern {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
       for(int line=1;line<=n;line++){
        for(int star=1;star<=line;star++){
            System.out.print(" * ");
        }
        for(int space=1; space<=(2*(n-line)); space++){
            System.out.print("   ");
        }
        for(int stars=1;stars<=line;stars++){
            System.out.print(" * ");
        }
        System.out.println();
       }

       for(int line=n;line>=1;line--){
        for(int star=1;star<=line;star++){
            System.out.print(" * ");
        }
        for(int space=1; space<=(2*(n-line)); space++){
            System.out.print("   ");
        }
        for(int stars=1;stars<=line;stars++){
            System.out.print(" * ");
        }
        System.out.println();
       }
    }
}
