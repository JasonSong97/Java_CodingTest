package src.pg.pg_12925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PG_12925 {
    // 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        System.out.println(Integer.parseInt(string));
    }

    // 2
    public int getStrToInt(String str) {
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
    }
}
