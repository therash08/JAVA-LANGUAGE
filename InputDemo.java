
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // int number;
        // System.out.println("enter a number: ");
        // number = input.nextInt();
        // System.out.println("number = "+number);
        
        String name ;
        System.out.print("enter your name: ");
        name = input.nextLine();
        System.out.println("welcome : "+name);


    }
}
