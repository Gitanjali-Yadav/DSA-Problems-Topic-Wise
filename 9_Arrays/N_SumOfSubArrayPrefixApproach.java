public class N_SumOfSubArrayPrefixApproach {
    public static void main(String[] args) {
        int numbers[]={1,-2, 6, -1, 3};
        calculateSum(numbers);
    }

    public static void calculateSum(int arr[]){

        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        //calculate prefix array

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum = (start==0) ? prefix[end]:prefix[end]-prefix[start-1];

                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
}
