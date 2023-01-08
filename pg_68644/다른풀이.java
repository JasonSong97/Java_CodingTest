package src.pg.pg_68644;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 다른풀이 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();// 2,1,3,4,1
        }

        // logic
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        }

        // output
        // return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
