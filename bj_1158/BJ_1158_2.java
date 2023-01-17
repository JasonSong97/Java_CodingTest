package src.bj.bj_1158;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BJ_1158_2 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // logic
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < N + 1; i++) list.add(i);

        StringBuilder answer = new StringBuilder();
        answer.append("<");

        int index = 0;

        while (list.size() > 0) {
            index = (index + (K - 1)) % list.size();// 1234567 -> 124567 3 -> 12457 36 -> 1457 362 -> 145 3627 -> 14 36275 -> ...

            answer.append(list.remove(index)).append(", ");
        }

        answer.delete(answer.length() - 2, answer.length());// answer.length() - 2 <= X < answer.length() 제거(범위)
        // answer.deleteCharAt(answer.length() - 1)// 마지막 원소 하나만 제거
        answer.append(">");

        // output
        System.out.println(answer);
    }
}
