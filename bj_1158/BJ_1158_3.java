package src.bj.bj_1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BJ_1158_3 {
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        // BufferedReader -> 문자열을 한 줄로 만 읽음 -> N, K 공백 기준 문자열 분리 해주기 -> StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // logic
        for (int i = 1; i < N + 1; i++) queue.offer(i);

        StringBuilder answer = new StringBuilder();
        answer.append("<");

        while(queue.size() > 1) {
            for(int i = 0; i < K - 1; i++) queue.offer(queue.poll());

            answer.append(queue.poll()).append(", ");
        }

        answer.append(queue.poll()).append('>');

        // output
        System.out.println(answer);

    }
}
