
import java.util.Scanner;

public class conditional_statement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("enter any num: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {

            System.out.println("negative");
        } else {
            System.out.println("equal to zero");
        }

    }

}
