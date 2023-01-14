package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test19941 {
    static int N,K;
    static char[] list;
    static boolean[] ch;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        list = new char[N];
        ch = new boolean[N];
        for(int i=0; i<N; i++){
            list[i] = str.charAt(i);
        }

        int res = 0;
        for(int i=0; i<N; i++){
            if(list[i]=='P') {
                int startIndex = Math.max(i-K,0);
                int endIndex = Math.min(i+K,N-1);
                for(int j=startIndex; j<=endIndex; j++){
                    if(list[j]=='H' && !ch[j]){
                        ch[j] = true;
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
