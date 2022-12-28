package src.pg.pg_12937;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12937 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println((num % 2 == 0) ? "Even" : "Odd");
    }
}
