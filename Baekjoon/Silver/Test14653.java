// [S2]너의 이름은
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14653 {
    static int n, k, q;
    static int[] num = new int[10001];
    static int[] who = new int[10001];
    static int[] check = new int[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= k; i++) {
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            who[i] = st.nextToken().charAt(0);
        }

        if(num[q] == 0){
            System.out.println(-1);
            return;
        }

        for(int i = 1; i <= k; i++){
            if(num[q] <= num[i]) check[who[i] - 'A'] = 1;
        }

        check[0] = 1;

        for(int i=0; i < n; i++)
            if(check[i] != 1) {
                char res = (char)(i + 'A');
                System.out.print(res);
                System.out.print(' ');
            }


    }
}
