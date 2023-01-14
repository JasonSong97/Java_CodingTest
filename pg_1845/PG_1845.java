package src.pg.pg_1845;

import java.util.*;

public class PG_1845 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        int answer = 0;

        /* logic1
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, 0);
        }

        int n1 = map.keySet().size();
        int n2 = nums.length / 2;

        answer = Math.min(n1, n2);
        */

        // logic2
        List<Integer> list = new LinkedList<>();
        for (int n: nums) {
            if (!list.contains(n)) {
                list.add(n);
            }
        }

        int n1 = list.size();
        int n2 = nums.length / 2;

        answer = Math.min(n1, n2);

        // output
        System.out.println(answer);
    }
}
