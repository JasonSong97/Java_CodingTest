package src.pg.pg_12932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PG_12932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        String numStr = String.valueOf(n);
        int[] answer = new int[numStr.length()];

        for(int i = numStr.length() - 1; i >= 0; i--){
            answer[numStr.length() - 1 - i] = numStr.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(answer));
    }
}
