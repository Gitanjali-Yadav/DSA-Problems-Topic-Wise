import java.util.Scanner;

public class J_Averageof_n_Scores {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int score[]=new int[n];
        int sum=0;
        for(int i=0;i<score.length;i++){
            
            System.out.println("Enter Score: ");
            int s=sc.nextInt();
            sum=sum+s;
            
        }
        double avg=sum/score.length;
        System.out.println(avg);
    

    }
}
