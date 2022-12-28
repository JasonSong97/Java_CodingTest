package src.pg.pg_12933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class PG_12933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());// 118372
        long answer = 0;
        
        List<Long> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        list.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            answer += (long) (list.get(i) * Math.pow(10, list.size() - i - 1));
        }
        System.out.println(answer);
    }
}
