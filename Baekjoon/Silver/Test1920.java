// [S4]수 찾기
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1920 {
    static int[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            if(bSearch(Integer.parseInt(st.nextToken())) >= 0)
                sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }

        System.out.println(sb);
    }

    // 이분탐색
    public static int bSearch(int num){
        int lp = 0;             // 탐색 범위의 왼쪽 끝 인덱스
        int rp = A.length - 1;  // 탐색 범위의 오른쪽 끝 인덱스

        while(lp <= rp){
            int mid = (lp + rp) / 2;  // 중간 위치

            if(num < A[mid]) rp = mid -1;
            else if(num > A[mid]) lp = mid + 1;
            else return mid;  // num 값과 중간 위치의 값이 같을 경우
        }

        return -1;
    }
}
