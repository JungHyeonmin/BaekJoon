import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1~6 주사위 3개를 던졌을 때
         * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
         * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
         * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
         */

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = 0;
        if (A == B && B == C) {
            result = 10000 + A * 1000;
        } else if ((A == B && A != C)) {
            result = 1000 + A * 100;
        } else if ((A == C && A != B)) {
            result = 1000 + A * 100;
        } else if ((B == C && B != A)) {
            result = 1000 + B * 100;
        } else if (A != B && A != C && B != C) {
            if (A > B && A > C) {
                result = A * 100;
            } else if (B > A && B > C) {
                result = B * 100;
            } else if (C > A && C > B) {
                result = C * 100;
            }
        }

        System.out.println(result);
    }
}
