package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String res = "";

        while(st.hasMoreTokens()){
            String tmp = st.nextToken();
            if (tmp.length() > res.length()) res = tmp;
        }

        System.out.println(res);
    }
}
