import java.util.Arrays;

public class C_SelectionSort {
    public static void main(String[] args) {
        int arr[]={};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;//index

            for(int j=i+1; j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;//index
                }
            }

            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
}
