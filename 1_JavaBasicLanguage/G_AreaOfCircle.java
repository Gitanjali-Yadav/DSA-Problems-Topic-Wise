import java.util.Scanner;

public class G_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter radius: ");
        int rad=sc.nextInt();

        calculateArea(rad);
    }

public static void calculateArea(int rad){
    double area=0;
    double pi=3.14;

    area=pi*rad*rad;

    System.out.println(area);


}
}
