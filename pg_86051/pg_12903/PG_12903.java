package src.pg.pg_12903;

import java.util.Scanner;

public class PG_12903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String answer = "";

        if (s.length() % 2 != 0) {
            answer = "" + s.charAt(s.length() / 2);
        } else {
            answer = s.charAt((s.length() / 2) - 1) + "" + s.charAt(s.length() / 2);
        }

        System.out.println(answer);
    }
}
