// [S5]K번째 수
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Test11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String nums = br.readLine();
        int[] arr = Stream.of(nums.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
    }
}
