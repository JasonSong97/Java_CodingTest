package src.pg.pg_12919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        String[] seoul = temp.split(" ");
        String answer = "";
        int idx = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                idx = i;
                break;
            }
        }

        answer = "김서방은 " + idx + "에 있다";// String answer = ""; 에다가 더하는 것이 가능함. 처음알았다!!!!!
        System.out.println(answer);
    }
}
