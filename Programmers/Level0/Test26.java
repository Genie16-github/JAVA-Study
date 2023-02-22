// 삼각형의 완성조건(1)
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int[] sides) {
            Arrays.sort(sides);
            if (sides[0] + sides[1] <= sides[2]) return 2;
            else return 1;
        }
    }
}
