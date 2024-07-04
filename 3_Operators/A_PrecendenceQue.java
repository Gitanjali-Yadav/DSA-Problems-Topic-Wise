public class A_PrecendenceQue {

    public static void main(String[] args) {
        
        int x = 2, y = 5;
        int exp1 = (x * y / x);//5 -->mul, div
        int exp2 = (x * (y / x));//4 --> parentheses, mul
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}