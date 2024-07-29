public class H_SmallestNumberInArray {
    public static void main(String[] args) {
        int arr[]={1,5,2,8,6};

        System.out.println("Smallest Number= " + smallestNum(arr) );
    }

    public static int smallestNum(int arr[]){
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }
}
