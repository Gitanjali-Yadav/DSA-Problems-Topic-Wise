import java.util.Scanner;

public class B_InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter n : ");
        int n= sc.nextInt();

        for(int lines=1;lines<=n;lines++){
            for(int star=1;star<=(n-lines)+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
