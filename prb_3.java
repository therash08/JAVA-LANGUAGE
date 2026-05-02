
import java.util.Scanner;

public class prb_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            long N = sc.nextLong(); // money amount
            System.out.println(N / 250);
        }

        sc.close();
    }
}
