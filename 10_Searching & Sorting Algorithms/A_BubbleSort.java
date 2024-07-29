
import java.util.Arrays;

/**
 * A_BubbleSort
 */
public class A_BubbleSort {

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            //turns
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag=false){
                break;
            }
        }
    }
    
    
}