// 아이스 아메리카노
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution.solution(n)));
    }

    static class Solution {
        public int[] solution(int money) {
            return (new int[]{money / 5500, money % 5500});
        }
    }
}
