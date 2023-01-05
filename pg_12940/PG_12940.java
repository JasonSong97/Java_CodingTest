package src.pg.pg_12940;

import java.util.Arrays;
import java.util.Scanner;

public class PG_12940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] answer = new int[2];

        if (n < m) {// m 작은값 만드는 과정 < n 큰값
            int temp = m;
            m = n;
            n = temp;
        }


        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];

        System.out.println(Arrays.toString(answer));
    }

    static int gcd(int n, int m) {
        int k;
        while (m > 0) {// (648, 232) -> (232, 184) -> (184, 48) -> (48, 40) -> (40, 8)!
            k = n % m;
            n = m;
            m = k;
        }
        return n;
    }
    /* 재귀 함수 방법
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
    */
}
