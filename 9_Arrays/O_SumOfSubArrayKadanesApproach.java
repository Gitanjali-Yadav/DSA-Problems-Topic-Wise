public class O_SumOfSubArrayKadanesApproach {
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

    }

    public static void kadanes(int num[]){
        int maxSum=Integer.MIN_VALUE;

        int currentSum=0;

        for(int i=0;i<num.length;i++){
            currentSum=currentSum+num[i];

            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(maxSum, currentSum);
        }
        System.out.println("MAx is: " + maxSum);
    }
}
