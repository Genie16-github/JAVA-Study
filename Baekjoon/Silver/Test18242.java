// [S5]네모네모 시력검사
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test18242{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cs = 0, cnt = 0;
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            if (tmp.indexOf('#') == -1) continue;

            cs = tmp.indexOf('#');
            cnt = 1;
            for (int j = cs+1; j < M; j++) {
                if (tmp.charAt(j) == '.') break;
                cnt++;
            }

            if (cnt != tmp.lastIndexOf('#')-tmp.indexOf('#')+1) {
                System.out.println("UP");
                return;
            }
            break;
        }

        for (int i = 0; i < (cnt-2)/2; i++) {
            br.readLine();
        }

        String tmp = br.readLine();
        if (tmp.charAt(cs) == '#' && tmp.charAt(cs+cnt-1) == '#') {
            System.out.println("DOWN");
        } else if (tmp.charAt(cs) == '#') {
            System.out.println("RIGHT");
        } else {
            System.out.println("LEFT");
        }
    }
}
