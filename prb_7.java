
import java.util.Scanner;

public class prb_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int num = sc.nextInt();   // ✅ read input

            if (num != 3) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
