
import java.util.Scanner;

public class prb_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            if (name.startsWith("BD")) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
