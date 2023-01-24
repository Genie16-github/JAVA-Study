// [S5]간판
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5534 {
    static char[] name;
    static int n, avg_gap;
    static int res = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        name = br.readLine().toCharArray();
        n = name.length;
        
        for (int i = 0; i < N; i++) {
            String input_data = br.readLine();
            if (checkStr(input_data) == 1){
                res++;
            }
        }
        System.out.println(res);
    }

    public static int checkStr(String str){
        int l = str.length();
        char[] arr = str.toCharArray();

        for (int i = 0; i < l; i++) {
            if (arr[i] == name[0]){
                for (int j = i; j < l; j++) {
                    int chk = 0;
                    if (arr[j] == name[n-1]){
                        avg_gap = (j-i) / (n-1);
                        int cnt = 0;
                        while (cnt < n){
                            if (arr[i + avg_gap * cnt] == name[cnt]){
                                cnt += 1;
                                continue;
                            }
                            chk = 1;
                            break;
                        }
                        if (chk == 0) return 1;
                    }
                }
            }
        }
        return 0;
    }
}

