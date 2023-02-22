// 숫자 비교하기
package Level0;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int age) {
            return 2022 - age + 1;
        }
    }
}
