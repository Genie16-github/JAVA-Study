// [S5]라디오
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int res = Math.abs(A - B);
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (Math.abs(B - tmp) < res) res = Math.abs(B - tmp) + 1;
        }

        System.out.println(res);
    }
}
