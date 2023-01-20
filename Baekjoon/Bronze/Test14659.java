// [B1]한조서열정리하고옴ㅋㅋ
package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14659 {
    static int res = -2147000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 활잡이 수
        int[] arr = new int[N];
        String nums = br.readLine(); // 봉우리 높이
        StringTokenizer st = new StringTokenizer(nums);
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 봉우리 높이 하나씩 저장
        }

        // 이중 for문 돌면서 자기보다 낮은 봉우리 카운트, 높으면 포기
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i+1; j < N; j++) {
                if(arr[i] > arr[j]) cnt++;
                else break;
            }
            res = Math.max(res, cnt);
        }
        System.out.println(res);
    }
}
