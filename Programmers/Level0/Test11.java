// 양꼬치
package Level0;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution.solution(n, k));
    }

    static class Solution {
        public int solution(int n, int k) {
            return (n * 12000 + k * 2000 - (n / 10) * 2000);
        }
    }
}
