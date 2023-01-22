// [B2]사과와 바나나 나눠주기
package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());  // 사과 개수
        int B = Integer.parseInt(st.nextToken());  // 바나나 개수

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= Math.min(A, B); i++) {
            if(A%i == 0 && B%i == 0){
                sb.append(i).append(" ").append(A / i).append(" ").append(B / i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
