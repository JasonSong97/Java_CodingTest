package src.pg.pg_12947;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String xStr = Integer.toString(x);
        int sum = 0;
        boolean answer = true;

        for (int i = 0; i < xStr.length(); i++) {
            sum += (xStr.charAt(i) - '0');
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
