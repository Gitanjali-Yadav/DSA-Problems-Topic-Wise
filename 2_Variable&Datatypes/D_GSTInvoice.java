// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class D_GSTInvoice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the amount of Pencil = ");
        float pencil=sc.nextFloat();

        System.out.println("Enter the amount of Pen = ");
        float pen=sc.nextFloat();

        System.out.println("Enter the amount of Eraser = ");
        float eraser=sc.nextFloat();

        calcInvoice(pencil, pen, eraser);
    }

    public static void calcInvoice(float pencil, float pen, float eraser){
        double bill=pencil+pen+eraser;
        System.out.println("Bill = " + bill);

        double gst = bill + (bill * 0.18);

        System.out.println("total bill with 18% gst = " + gst);
    }
}
