package src.pg.pg_12916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PG_12916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean answer = true;

        List<Character> pList = new ArrayList<>();
        List<Character> yList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P' || s.charAt(i) == 'p') {
                pList.add(s.charAt(i));
            } else if (s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
                yList.add(s.charAt(i));
            }
        }

        if (pList.size() == yList.size() || (pList == null || yList == null)) {
            answer = true;
        } else {
            answer = false;
        }

        System.out.println(answer);
    }
}
