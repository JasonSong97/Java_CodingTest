package src.pg.pg_12934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long answer = 0;

        if (n == Math.pow((int) Math.sqrt(n), 2)) {
            answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
        } else {
            answer = -1;
        }
    }
}
