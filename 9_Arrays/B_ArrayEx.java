import java.util.Scanner;

public class B_ArrayEx {
    public static void main(String[] args) {
        
        int marks[]=new int[10];

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the marks of Physics : ");
        marks[0]=sc.nextInt();

        System.out.println("Please enter the marks of Maths : ");
        marks[1]=sc.nextInt();

        System.out.println("Please enter the marks of Chemistry : ");
        marks[2]=sc.nextInt();

        System.out.println("physics Marks = " + marks[0]);
        System.out.println("Math Marks = " + marks[1]);
        System.out.println("Chem Marks = " + marks[2]);
    }
}
