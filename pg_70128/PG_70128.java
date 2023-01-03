package src.pg.pg_70128;

import java.util.Scanner;

public class PG_70128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int[] a = new int[A];
        for (int i = 0; i < A; i++) {
            a[i] = scanner.nextInt();
        }
        int B = scanner.nextInt();
        int[] b = new int[B];
        for (int i = 0; i < B; i++) {
            b[i] = scanner.nextInt();
        }
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        System.out.println(answer);
    }
}
