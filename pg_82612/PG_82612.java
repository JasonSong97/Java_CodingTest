package src.pg.pg_82612;

import java.util.Scanner;

public class PG_82612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int money = scanner.nextInt();
        int count = scanner.nextInt();


        long answer = -1;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (price * i);
        }

        if (money < sum) {
            answer = sum - money;
        } else {
            answer =  0;
        }

        System.out.println(answer);
    }
}
