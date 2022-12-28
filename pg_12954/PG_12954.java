package src.pg.pg_12954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PG_12954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x = answer[i] + answer[0];
        }

        System.out.println(Arrays.toString(answer));// arrays 출력 방법!
    }
}
