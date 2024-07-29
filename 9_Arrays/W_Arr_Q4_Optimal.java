//two pointer technique
public class W_Arr_Q4_Optimal {
    public static void main(String[] args) {
        //int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int height[]={4, 2, 0, 3, 2, 5};
        System.out.println(calculateTrappedRainwater(height));
    }

    public static int calculateTrappedRainwater(int height[]){

        int n=height.length-1;
        int l=0, r=n; //pointers

        int lMax=height[l];
        int rMax=height[r];

        int trappedrainwater=0;

        while(l<r){
            if(lMax<rMax){
                l++;
                lMax=Math.max(lMax,height[l]);
                trappedrainwater += lMax-height[l];
            }else{
                r--;
                rMax=Math.max(rMax, height[r]);
                trappedrainwater += rMax-height[r];
            }
        }

        

        return trappedrainwater;
    }
}
