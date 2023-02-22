// 배열의 평균값
package Level0;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public double solution(int[] numbers) {
            double answer = 0;
            for (int number : numbers) answer += number;
            return answer / numbers.length;
        }
    }
}
