// [S4]온라인 판매
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M], sum = new int[M];
        int max, idx = 0;

        for(int i = 0; i < M; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        for (int i = 0; i < M; i++) {
            if(M > N) { // 사람이 달걀 갯수보다 많을 경우
                if(i < (M-N+1)) // 달걀을 모두 판매하는 경우
                    sum[i] = arr[i] * N;
                else // 달걀 일부만 판매하는 경우
                    sum[i] = arr[i] * (M-i);
            } // 달걀이 사람 수보다 많을 경우
            else
                sum[i] = arr[i] * (M-i);
        }

        max = sum[0];
        for(int i = 1; i < M; i++) {
            if (sum[i] > max) {
                max = sum[i];
                idx = i;
            }
        }

        System.out.println(arr[idx] + " " + max);
    }
}
