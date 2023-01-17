package src.bj.bj_1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ_1158_1 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // logic
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N + 1; i++) {// add -> 예외발생 | offer -> false 리턴
            queue.offer(i);
        }

        StringBuilder answer = new StringBuilder();
        answer.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int extraNumber = queue.poll();
                queue.offer(extraNumber);
            }

            answer.append(queue.poll()).append(", ");
        }

        answer.append(queue.poll()).append(">");
        // output
        System.out.println(answer);
    }
}
