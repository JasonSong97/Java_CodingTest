package src.pg.pg_12944;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{Integer.parseInt(br.readLine())};
        double answer = 0;

        for (double num: arr) {
            answer += num;
        }
        System.out.println(answer / arr.length);
    }
}
