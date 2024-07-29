public class K_PairsInArray {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
    }
    public static void printPairs(int arr[]){

        for(int i=0;i<arr.length;i++){
            int current=arr[i];

            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
