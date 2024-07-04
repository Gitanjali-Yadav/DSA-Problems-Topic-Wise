public class H_BreakKeyWordEx {
    public static void main(String[] args) {
        int i=1;

        do{
            if(i==5){
                break;
            }
            System.out.println(i + "Hello");
            i++;
            
        }while(i<=10);
    }
}
