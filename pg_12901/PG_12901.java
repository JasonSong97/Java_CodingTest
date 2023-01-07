package src.pg.pg_12901;

import java.util.Scanner;

public class PG_12901 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        int[] monthArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayStr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int daySum = 0;

        // logic
        for (int i = 0; i < month - 1; i++) {
            daySum += monthArray[i];
        }
        daySum += day;// month, day 까지의 총 day

        int dayModule = 7;
        int dayCalc = daySum % dayModule;

        // output
        String answer = "" + ((dayCalc == 0) ? dayStr[6] : dayStr[dayCalc - 1]);// 1빼는 이유는 컴퓨터가 0부터 카운팅 해서
        System.out.println(answer);
    }
}
