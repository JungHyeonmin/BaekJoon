package level3;

import java.util.Scanner;

public class Boj2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            // 공백
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }

            // 별
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
