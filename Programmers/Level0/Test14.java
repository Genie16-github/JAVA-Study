// 피자 나눠 먹기(1)
package Level0;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int n) {
            int answer = n / 7;
            if(n % 7 != 0) answer += 1;
            return answer;
        }
    }
}
