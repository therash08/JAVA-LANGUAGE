
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("enter any num: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
