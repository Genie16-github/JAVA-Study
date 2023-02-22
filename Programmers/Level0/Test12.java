// 짝수의 합
package Level0;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int n) {
            int sum = 0;
            for (int i = 2; i <= n; i += 2){
                sum += i;
            }
            return sum;
        }
    }
}
