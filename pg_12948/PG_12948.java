package src.pg.pg_12948;


import java.util.Scanner;

public class PG_12948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone_number = scanner.nextLine();

        char[] phone_Arr = phone_number.toCharArray();// 배열로 바꾸기

        for (int i = 0; i < phone_Arr.length - 4; i++) {
            phone_Arr[i] = '*';
        }


        String answer = new String(phone_Arr);
        System.out.println(answer);
    }
}
