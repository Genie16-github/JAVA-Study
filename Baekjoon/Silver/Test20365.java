// [S3]블로그2
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test20365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> bList = new ArrayList<>();
        List<String> rList = new ArrayList<>();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, "R");

        while (st.hasMoreTokens()) {
            bList.add(st.nextToken());
        }

        st = new StringTokenizer(str, "B");

        while (st.hasMoreTokens()) {
            rList.add(st.nextToken());
        }

        int res;
        if (rList.size() >= bList.size()) res = bList.size() + 1;
        else res = rList.size() + 1;

        System.out.println(res);
    }
}
