// [S3]눈덩이 굴리기
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Test21735 {
    public static int[] nums = new int[101];
    public static int N, M, res = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str);
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 1, 0);
        System.out.println(res);

    }

    public static void dfs(int idx, int size, int time){
        if(time == M || idx >= N){
            res = Math.max(res, size);
            return;
        }

        for (int i = 1; i <= 2; i++) {
            if(i == 1) dfs(idx+i, size+nums[idx+i], time+1);
            else dfs(idx+i, (size/2)+nums[idx+i], time+1);
        }
    }
}

