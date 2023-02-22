// 배열 두 배 만들기
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Solution st = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; // 배열의 크기
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(st.solution(num)));

    }

    static class Solution {
        public int[] solution(int[] numbers) {
            for(int i = 0; i < numbers.length; i++) numbers[i] *= 2;
            return numbers;
        }
    }
}
