package src.pg.pg_81301;

import java.util.Scanner;

public class PG_81301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] numList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(numList[i], i + "");
        }

        int answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
