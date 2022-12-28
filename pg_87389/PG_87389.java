package src.pg.pg_87389;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_87389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        n -= 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
