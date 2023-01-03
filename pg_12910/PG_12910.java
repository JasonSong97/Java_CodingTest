package src.pg.pg_12910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PG_12910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrN = scanner.nextInt();
        int[] arr = new int[arrN];
        for (int i = 0; i < arrN; i++) {
            arr[i] = scanner.nextInt();
        }
        int divisor = scanner.nextInt();

        List<Integer> answerList = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                answerList.add(num);
            }
        }
        if (answerList.size() == 0) {
            answerList.add(-1);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
