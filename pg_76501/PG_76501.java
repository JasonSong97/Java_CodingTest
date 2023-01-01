package src.pg.pg_76501;

import java.util.Scanner;

public class PG_76501 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int[] absolutes = new int[A];
        for (int i = 0; i < A; i++) {
            absolutes[i] = scanner.nextInt();
        }

        boolean[] signs = new boolean[A];
        for (int i = 0; i < A; i++) {
            signs[i] = scanner.nextBoolean();
        }

        int answer  = 0;

        // logic
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        // output

        System.out.println(answer);
    }
}
