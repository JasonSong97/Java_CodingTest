package src.pg.pg_12912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        long answer = 0;

        if (a <= b) {
            while (a <= b) {
                answer += a;
                a++;
            }
        } else {
            while (b <= a) {
                answer += b;
                b++;
            }
        }

        System.out.println(answer);
    }
}
