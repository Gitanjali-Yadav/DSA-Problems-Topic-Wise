public class M_SumOfSubArray {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);
    }

    public static void printSubArray(int arr[]){

        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int sum=0;//resetting sum
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];

                if(maxSum<sum){
                    maxSum=sum;
                }
                if(minSum>sum){
                    minSum=sum;
                }
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                    
                }
                System.out.print("->Sum= " + sum);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max Sum = " + maxSum);
        System.out.println("Min Sum = " + minSum);


    }
}
