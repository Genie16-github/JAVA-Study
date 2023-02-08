// [S5]이장님 초대
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test9237 {
    static Integer[] nums;
    static int sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        nums = new Integer[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums, Collections.reverseOrder());

        sum = nums[0];
        for (int i = 1; i < N; i++) {
            int tmp = (nums[i]+i) - nums[0];
            if (tmp > 0) sum += tmp;
        }
        System.out.println(sum+1);
    }

}
