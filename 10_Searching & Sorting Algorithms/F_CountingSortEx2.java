public class F_CountingSortEx2 {
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
    public static void printArr(int arr[]){

        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){

        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            ++count[arr[i]];
        }

        for(int i=1;i<=largest;i++){
            count[i]=count[i]+count[i-1];
        }
        int b[]=new int[arr.length];
        for(int i=b.length-1;i>=0;i--){
            b[--count[arr[i]]]=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=b[i];
        }
    }
}

