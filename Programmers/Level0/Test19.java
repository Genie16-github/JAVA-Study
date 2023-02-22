// 배열 자르기
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(Arrays.toString(solution.solution(num, num1, num2)));
    }

    static class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];
            int idx = 0;
            for (int i = num1; i <= num2; i++){
                answer[idx] = numbers[i];
                idx++;
            }
            return answer;
        }
    }
}
