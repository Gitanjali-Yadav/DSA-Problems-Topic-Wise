import java.util.Arrays;

public class J_ReverseArray {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        System.out.println("Original Array = "+ Arrays.toString(num));
    
        reveresArray(num);

        System.out.println("Reversed Array = "+ Arrays.toString(num));

    }

    public static void reveresArray(int arr[]){

        int first=0, last=arr.length-1;
        
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }
}
