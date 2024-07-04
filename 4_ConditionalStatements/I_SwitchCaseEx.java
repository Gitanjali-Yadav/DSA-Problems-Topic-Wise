import java.util.Scanner;

public class I_SwitchCaseEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number : \n e.g(1-10)");
        System.out.println("###############################");

        int number=sc.nextInt();

        switch(number){
            case 1: System.out.println("Samosa");break;
            case 2: System.out.println("Burger");break;
            case 3: System.out.println("Pizza");break;
            case 4: System.out.println("French Fries");break;
            case 5: System.out.println("Cold Coffee");break;
            case 6: System.out.println("Ramen Noodles");break;
            case 7: System.out.println("Pasta");break;
            case 8: System.out.println("Vadapav");break;
            case 9: System.out.println("Pav Bhaji");break;
            case 10: System.out.println("Falooda Ice-cream");break;
            default: System.out.println("OOPS ! Unavailable Try Again !");
        }

    }
}
