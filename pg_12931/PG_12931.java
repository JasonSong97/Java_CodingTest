package src.pg.pg_12931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        String nStr = Integer.toString(n);

        for (int i = 0; i < nStr.length(); i++) {
            answer += (nStr.charAt(i) - '0');
        }

        System.out.println(answer);
    }
}
