// [S3]팰린드롬 만들기
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] alpha = new int[26];
        for(int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i)-'A';
            alpha[idx]++;
        }

        int isOne = 0;
        for (int j : alpha) {
            if (j % 2 != 0) isOne++;
        }

        String res = "";
        StringBuilder sb = new StringBuilder();
        if (isOne > 1) res += "I'm Sorry Hansoo";
        else {
            for(int i = 0; i < alpha.length; i++) {
                sb.append(String.valueOf((char) (i + 65)).repeat(Math.max(0, alpha[i] / 2)));
            }
            res += sb.toString();
            String end = sb.reverse().toString();

            sb = new StringBuilder();
            for(int i = 0; i < alpha.length; i++) {
                if(alpha[i]%2 == 1) {
                    sb.append((char)(i+65));
                }
            }
            res += sb +end;
        }
        System.out.println(res);
    }
}
