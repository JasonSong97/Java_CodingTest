package src.pg.pg_12922;

import java.util.Scanner;

public class PG_12922 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }

        System.out.println(answer.toString());
    }
}
