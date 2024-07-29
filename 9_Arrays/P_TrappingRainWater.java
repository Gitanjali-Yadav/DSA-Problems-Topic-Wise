public class P_TrappingRainWater {
    public static void main(String[] args) {
        int heightBars[]={4,2,0,6,3,2,5};
        calculateTrappedRainwater(heightBars);
        
    }

    public static void calculateTrappedRainwater(int height[]){

        //calculate leftmax boundary array
        //calculate right max boundary array
        //traverse through all elements of the height array
        //find waterlevel=min(rightmax[i],leftmax[i])
        //find trapped water=waterlevel-height[i]*width
        //to find sum use trapped water+=waterlevel-height[i]*width
    
        int leftMax[]=new int[height.length];
        //corner case
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
    
    
        int rightMax[]=new int[height.length];
        //corner case
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int waterlevel=0;
        int trappedwater=0;
        int width=1;//given
        for(int i=0;i<height.length;i++){
            waterlevel=Math.min(leftMax[i], rightMax[i]);

            trappedwater+=((waterlevel-height[i])*width);
        }

        System.out.println("Trapped Amount of Water = " + trappedwater);
    
    }
}
