// 짝수 홀수 개수
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution.solution(num)));
    }

    static class Solution {
        public int[] solution(int[] num_list) {
            int a = 0, b = 0;
            for (int j : num_list) {
                if (j % 2 == 0) a += 1;
                else b += 1;
            }

            return new int[]{a, b};
        }
    }
}
