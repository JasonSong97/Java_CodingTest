package src.pg.pg_19010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PG_12910 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> answerList = new ArrayList<>();

        // logic
        for (int num : arr) {
            if (num % divisor == 0) {// 나누어 떨어지면 answerList 에 추가!
                answerList.add(num);
            }
        }
        if (answerList.size() == 0) {// 위의 for 문을 작업 후 아무것도 없으면 -1 추가!
            answerList.add(-1);
        }

        // output
        int[] answer = new int[answerList.size()];// List -> Array
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);// Arrays 정렬~
        System.out.println(Arrays.toString(answer));
    }
}
