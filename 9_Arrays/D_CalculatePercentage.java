import java.util.Scanner;

public class D_CalculatePercentage {
    public static void main(String[] args) {
        int marks[]=new int[10];

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the marks of Physics: ");
        int phy=sc.nextInt();

        System.out.println("Please enter the marks of Math: ");
        int math=sc.nextInt();

        System.out.println("Please enter the marks of Chem: ");
        int chem=sc.nextInt();

        marks[0]=phy;
        marks[1]=math;
        marks[2]=chem;

        System.out.println("Physics Marks = " + marks[0]);
        System.out.println("Math Marks = " + marks[1]);
        System.out.println("Chem Marks = " + marks[2]);

        System.out.println("Percentage = " + calculatePercentage(marks));

        
    }

    public static int calculatePercentage(int marks[]){

        int sumMarks=0;

        for(int i=0;i<marks.length;i++){
            sumMarks=sumMarks+marks[i];
        }

        int percentage=(sumMarks/3);

        return percentage;
    }
}
