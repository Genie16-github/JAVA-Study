// [S3]다이나믹이 뭐예요?
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14494 {
    
    static long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        dp = new long[N+1][M+1];
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < M+1; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(dp(N, M) % 1000000007);
        
    }
    
    public static long dp(int n, int m){
        if(n == 0 || m == 0) return 0;
        if(n == 1 && m == 1) return 1;
        if(dp[n][m] != -1) return dp[n][m];
        
        long res = (dp(n, m-1) + dp(n-1, m) + dp(n-1, m-1)) % 1000000007;
        dp[n][m] = res;
        return res;
    }
}
