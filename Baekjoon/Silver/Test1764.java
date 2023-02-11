// [S4]듣보잡
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test1764 {
    public static int N,M;
    public static HashSet<String> nl = new HashSet<>();   // contains 쓰면 시간 초과
    public static ArrayList<String> ns = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            nl.add(br.readLine());
        }
        for(int i = 0; i < M; i++) {
            String s = br.readLine();
            if(nl.contains(s)) {
                ns.add(s);
            }

        }

        Collections.sort(ns);
        System.out.println(ns.size());
        for (String n : ns) {
            System.out.println(n);
        }

    }

}
