// [B3]ABC
package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test3047 {
    static int[] arr = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        String[] ch = br.readLine().split("");
        for (String s : ch) {
            if (s.equals("A"))
                System.out.print(arr[0] + " ");
            if (s.equals("B"))
                System.out.print(arr[1] + " ");
            if (s.equals("C"))
                System.out.print(arr[2] + " ");
        }
    }
}
