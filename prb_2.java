
import java.util.Scanner;

public class prb_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char section = sc.next().charAt(0);

        if (section == 'A' || section == 'B') {
            System.out.println("JIM Sir");
        } else {
            System.out.println("MJR Sir");
        }

        sc.close();
    }
}
