//Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct.

import java.util.Arrays;

public class R_Arr_Q1_SpotDuplicateElements {
    public static void main(String[] args) {
        //int num[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       int num[]={1,2,3,4};
       //int num[]={1,3,2,1};
       System.out.println(repeatedElements(num));
    }

    public static boolean repeatedElements(int arr[]){

        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

}
