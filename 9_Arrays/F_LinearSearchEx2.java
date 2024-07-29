import java.util.Scanner;

public class F_LinearSearchEx2 {
    public static void main(String[] args) {
        String fruits[]={"Mango", "Orange", "Apple" , "Pomegranate", "Watermelon"};

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the key : ");
        String key=sc.nextLine();

        String index=linearSearch(fruits, key);

        if(index.equals("Not Found")){
            System.out.println("404: Key Not Found !!");

        }else{
            System.out.println("Key Found at index = " + index);
        }

    }

    public static String linearSearch(String arr[], String key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equalsIgnoreCase(key)){
                return String.valueOf(i);
            }
        }
        
        return "Not Found";
    }
}
