package src.bj.bj_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_1021_2 {
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] answerArray = new int[M];
        for (int i = 0; i < M; i++) answerArray[i] = Integer.parseInt(st.nextToken());

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
