package src.pg.pg_12918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {            
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                answer = false;
            }
        }
        
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        System.out.println(answer);
    }
}
