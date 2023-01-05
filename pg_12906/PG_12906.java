package src.pg.pg_12906;

import java.util.*;

public class PG_12906 {// 한번 더 풀기!
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();// 1 1 3 3 0 1 1
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // logic
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (stack.size() == 0 || arr[i] != stack.peek()) {// 같지 않으면 패스~
                stack.push(arr[i]);
            }
        }

        // output
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0 ; i--) {// 뒤에서 부터 복사
            answer[i] = stack.pop();
        }
        System.out.println(Arrays.toString(answer));
    }
}
