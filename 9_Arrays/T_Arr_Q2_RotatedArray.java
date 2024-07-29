public class T_Arr_Q2_RotatedArray {
    public static void main(String[] args) {
        // int key=-5;
        // int numbers[]={20,30,40,50,60,5,10};

        // int key=0;
        // int key=3;
        // int numbers[]={4, 5, 6, 7, 0, 1, 2};

        int key=0;
        int numbers[]={1};


        System.out.println("index of key= " + searchRotatedArray(numbers, key));

    }

    public static int searchRotatedArray(int arr[],int key){
       
        //modified binary search

        int start=0, end=arr.length-1;

        while(start<=end){
            //calculate mid
            int mid=((start+end)/2);

            //check if arr[mid]==key
            if(arr[mid]==key){
                return mid; //found
            }

            //check sorting
            if(arr[start]<arr[mid]){
                //left
                if(key<arr[mid] && key>=arr[start]){
                    //check if key exists on the left side of the array
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[start]>arr[mid]){
                    //right
                    if(key>arr[mid] && key<=arr[end]){
                    //check if key exists on the right side of the array
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }

                }
                
            }
        }
       
       
        return -1;//not found
    }
}
