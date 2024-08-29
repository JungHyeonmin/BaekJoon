import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int H = stdin.nextInt();
        int M = stdin.nextInt();

        if (M - 45 < 0) {

            int mod = M - 45;

            if (H - 1 < 0) {
                H = 23;
            } else {
                H -= 1;
            }

            M = 60 + mod;
        } else {
            M -= 45;
        }

        System.out.print(H + " ");
        System.out.println(M);
    }
}
