public class G_LargestNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,5,2,8,6};

        System.out.println("Largest Number= " + largestNum(arr) );
    }

    public static int largestNum(int arr[]){
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

}
