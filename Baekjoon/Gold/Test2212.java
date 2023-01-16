package Gold;

// [G5] 센서

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test2212 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        // 만약 집중국 갯수가 센서 갯수보다 많으면, 0을 출력하고 종료
        if (K >= N) {
            bw.write("0\n");
            bw.close();
            br.close();
            return;
        }

        // 센서 정보를 입력 받음
        int[] censor = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            censor[i] = temp;
        }

        // 센서의 거리를 오름차순으로 정렬
        Arrays.sort(censor);

        // 각 센서 거리의 차이를 배열에 담음
        int[] dif = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            dif[i] = censor[i + 1] - censor[i];
        }

        // 차이 배열을 정렬
        Arrays.sort(dif);

        // 차이 배열 마지막까지의 합을 출력
        int ans = 0;
        for (int i = 0; i < N - K; i++) {
            ans += dif[i];
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}

