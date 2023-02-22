// 피자 나눠 먹기(3)
package Level0;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int slice = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution.solution(slice, n));
    }

    static class Solution {
        public int solution(int slice, int n) {
            int tmp = 0;
            if (n % slice != 0) tmp = 1;
            return (n / slice + tmp);
        }
    }
}
