public class C {
    public static void main(String[] args) {
        
        int x, y, z;
        x = y = z = 2;
        x += y;//x=4 --> left to right associativity
        y -= z;//y=0 --> left to right associativity
        z /= (x + y);//z=2/4=0 --> bracket, div --> left to right associativity
        System.out.println(x + " " + y + " " + z);//4 0 0 
    }
}
