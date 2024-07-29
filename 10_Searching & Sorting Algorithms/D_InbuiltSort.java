import java.util.Arrays;
import java.util.Collections;

public class D_InbuiltSort {
    public static void main(String[] args) {
        // int arr[]={5,4,1,3,2};

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        

        // Arrays.sort(arr, 0, 3);
        // printArr(arr);

        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr , Collections.reverseOrder());
        // Arrays.sort(arr , 0, 3, Collections.reverseOrder());
        printArr(arr);

    }
    public static void printArr(Integer arr[]){

        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
