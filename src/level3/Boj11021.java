package level3;

import java.util.Scanner;

public class Boj11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            System.out.println("Case #" + (i) + ": " + (sc.nextInt() + sc.nextInt()));
        }
    }
}
