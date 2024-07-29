import java.util.HashSet;

public class S_Arr_Q1_Optimal {
    public static void main(String[] args) {
       //int num[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       //int num[]={1,2,3,4};
       int num[]={1,3,2,1};
       System.out.println(repeatedElements(num));
    }

    public static boolean repeatedElements(int arr[]){

        HashSet<Integer> elements = new HashSet<>();

        for (int n : arr) {
            if(!elements.add(n)){
                return true;//found
            }
        }
        return false;//not found

        //becoz hashset stores unique values
    }
}
