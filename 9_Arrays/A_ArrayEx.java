import java.util.Arrays;

public class A_ArrayEx {

     public static void main(String[] args) {
        
        //creating array
        //storing array elements
        //defining its size and length

        int marks[]=new int[10];//length is 10-> 0-9 elements

        int numbers[]={20,30,40};//length=3->0-2 elements

        int moreNumbers[]={50,60,70};//length=3->0-2 elements

        String fruits[]={"Mango","Orange","Apple"};//length=3->0-2 elements

        System.out.println("marks array = " + Arrays.toString(marks));
        System.out.println(marks.length);

        System.out.println("numbers array = " + Arrays.toString(numbers));
        System.out.println(numbers.length);

        System.out.println("morenumbers array = " + Arrays.toString(moreNumbers));
        System.out.println(moreNumbers.length);

        System.out.println("fruits array = " + Arrays.toString(fruits));
        System.out.println(fruits.length);
     }
}