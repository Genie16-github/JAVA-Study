// 최댓값 만들기(1)
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int[] numbers) {
            Arrays.sort(numbers);
            return (numbers[numbers.length-1] * numbers[numbers.length-2]);
        }
    }
}
