package src.pg.pg_68644;

import java.util.*;

public class PG_68644 {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();// 2,1,3,4,1
        }

        // logic
        List<Integer> listNum = new ArrayList<>();
        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp = numbers[i] + numbers[j];

                if (!listNum.contains(temp))
                    listNum.add(temp);
            }
        }

        Collections.sort(listNum);// Collections.sort(listNum, Collections.reverseOrder())

        // output
        int[] answer = new int[listNum.size()];
        for (int i = 0; i < listNum.size(); i++) {
            answer[i] = listNum.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
