import java.util.Scanner;
//Time complexity = O(n)
public class E_LinearSearchEx {
    public static void main(String[] args) {
        
        int numbers[]={2,4,6,8,10,12,14,16,18,20,22,24};

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the key: ");
        int key=sc.nextInt();

        int index=linearSearch(numbers, key);

        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key found at index: " + index);
        }

        
    }

    public static int linearSearch(int numbers[], int key){
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        
        return -1;
    }
}
