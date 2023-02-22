// 순서쌍의 개수
package Level0;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++){
                if (n % i == 0) answer++;
            }
            return answer;
        }
    }
}
