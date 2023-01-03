package src.pg.pg_77884;

import java.util.Scanner;

public class PG_77884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;

            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        System.out.println(answer);
    }

    /*for (int i=left;i<=right;i++) {
        //제곱수인 경우 약수의 개수가 홀수
        if (i % Math.sqrt(i) == 0) {
            answer -= i;
        }
        //제곱수가 아닌 경우 약수의 개수가 짝수
        else {
            answer += i;
        }
    }*/
}
