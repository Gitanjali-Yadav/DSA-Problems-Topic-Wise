public class I_BinarySearchExArray {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};

        int key=20;

        int index=binarySearch(numbers,key);

        System.out.println("Index for the key : " + key + " is  " + index);

    }

    public static int binarySearch(int arr[],int key){

        int start=0, end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                //found
                return mid;
            }
            if(arr[mid]<key){
                //right
                start=mid+1;
            }else{
                //left
                end=mid-1;
            }
        }
        return -1;
    }
}
