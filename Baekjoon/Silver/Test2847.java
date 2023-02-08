// [S4]게임을 만든 동준이
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2847 {
    static int[] nums;
    static int res = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i+1] <= nums[i]){
                int tmp = Math.abs(nums[i+1] - nums[i]) + 1;
                nums[i] = nums[i] - tmp;
                res += tmp;
            }
        }
        System.out.println(res);
    }
}
