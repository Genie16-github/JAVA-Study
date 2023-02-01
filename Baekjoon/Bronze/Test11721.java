// [B3]열 개씩 끊어 출력하기
package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();

        int idx = 0;
        for (int i = 0; i < len / 10; i++) {
            System.out.println(str.substring(idx, idx+10));
            idx += 10;
        }
        System.out.println(str.substring(idx));
    }
}
