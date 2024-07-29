public class V_Arr_Q4_RainwaterTrapping {
    
    public static void main(String[] args) {
        int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //int height[]={4, 2, 0, 3, 2, 5};
        System.out.println(calculateTrappedRainwater(height));
    }

    public static int calculateTrappedRainwater(int height[]){

        int n=height.length;

        //leftmax boundary
        int leftMax[]=new int[n];
        //corner case
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //rightmax boundary
        int rightMax[]=new int[n];
        //corner case
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }


        int waterlevel=0, trappedrainwater=0;

        for(int i=0;i<n;i++){

            waterlevel=Math.min(leftMax[i], rightMax[i]);

            trappedrainwater+=waterlevel-height[i];
        }

        return trappedrainwater;
    }
}
