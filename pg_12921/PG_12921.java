package src.pg.pg_12921;

import java.util.*;

public class PG_12921 {// 2 3 5 7 11 13 17 19 -> 요 숫자로 나누어 떨어지면 소수 아님
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();// 4
        int answer = 0;

        // logic
        int[] check = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
            check[i] = 1;
        }

        for (int i = 2; i < n; i++) {
            if (check[i] == 0)
                continue;

            for (int j = i * 2; j <= n; j += i) {
                check[j] = 0;
            }
        }

        for (int i = 1; i < check.length; i++) {
            if (check[i] != 0)
                answer++;
        }

        // output
        System.out.println(answer);
    }
}
