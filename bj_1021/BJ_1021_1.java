package src.bj.bj_1021;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * deque.addFirst(); // Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
 * deque.offerFirst(); //  Deque의 앞쪽에 데이터를 삽입 후 true, 용량 초과시 false
 *
 * deque.addLast(); // Deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception
 * deque.add(); // addLast()와 동일
 * deque.offerLast(); //Deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false
 * deque.offer(); // offerLast()와 동일
 *
 * deque.push(); // addFirst()와 동일
 * deque.pop(); // removeFirst()와 동일
 */

public class BJ_1021_1 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] answerArray = new int[M];
        for (int i = 0; i < M; i++) answerArray[i] = scanner.nextInt();

        int answer = 0;

        // logic
        LinkedList<Integer> doubleEndQueue = new LinkedList<>();// List -> add(예외발생) | LinkedList -> offer(false빈환)
        for (int i = 1; i < N + 1; i++) doubleEndQueue.offer(i);

        for (int i = 0; i < M; i++) {
            int targetIndex = doubleEndQueue.indexOf(answerArray[i]);

            int halfIndex;
            if (doubleEndQueue.size() % 2 == 0) halfIndex = doubleEndQueue.size() / 2 - 1;
            else halfIndex = doubleEndQueue.size() / 2;

            if (targetIndex <= halfIndex) {
                for (int j = 0; j < targetIndex; j++) {
                    int temp = doubleEndQueue.pollFirst();// 앞부분 원소 뽑기 -> 해당 부분 null
                    doubleEndQueue.offerLast(temp);
                    answer++;
                }
            } else {
                for (int j = 0; j < doubleEndQueue.size() - targetIndex; j++) {
                    int temp = doubleEndQueue.pollLast();
                    doubleEndQueue.offerFirst(temp);
                    answer++;
                }
            }

            doubleEndQueue.pollFirst();
        }

        // output
        System.out.println(answer);
    }
}
