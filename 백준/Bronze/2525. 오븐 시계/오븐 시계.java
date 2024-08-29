import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 오리를 넣으면 알아서 시간을 맞춰주는 오븐
        // 오븐구이를 만들어 주는데 분단위로 알려준다.

        // 첫째 줄에 종료되는 시각의 시와 분을 공백 을 사이에 두고 출력한다.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // 시작 시
        int B = sc.nextInt(); // 시작 분
        int C = sc.nextInt(); // 요리 시간(분)

        int share = C / 60; // 몫
        int mod = C % 60; // 나머지

        if (A >= 24) {
            A -= 24;
        }

        A += share;

        if (A >= 24) {
            A -= 24;
        }

        B += mod;

        if (B >= 60) {
            B -= 60;
            A += 1;
            if (A >= 24) {
                A -= 24;
            }
        }

        System.out.print(A + " ");
        System.out.println(B);
    }
}