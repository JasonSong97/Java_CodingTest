package src.pg.pg_12943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());// 16
        int answer = 0;// 4
        int count = 0;

        while (count <= 500) {
            if (num == 1) {
                if (count == 0) {break;}
                answer = count;
                break;
            }

            if (num % 2 == 1) {num = (num * 3) + 1;}
            else {num = num / 2;}
            count++;
        }
        if (count > 500) {answer = -1;}

        System.out.println(answer);
    }
}
