package src.pg.pg_12917;

import java.util.Arrays;
import java.util.Scanner;

public class PG_12917 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        int size = sArr.length;

        for (int i = 0; i < size / 2; i++) {
            char temp = sArr[size - 1 -i];
            sArr[size - 1 - i] = sArr[i];
            sArr[i] = temp;
        }

        String answer = new String(sArr);
        System.out.println(answer);
    }
}
