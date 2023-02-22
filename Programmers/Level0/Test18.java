// 점의 위치 구하기
package Level0;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int[] dot) {
            if (dot[0] > 0 & dot[1] > 0) return 1;
            else if (dot[0] < 0 & dot[1] > 0) return 2;
            else if (dot[0] < 0 & dot[1] < 0) return 3;
            else return 4;
        }
    }
}
