// 각도기
package Level0;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int angle) {
            if (0 < angle && angle < 90) return 1;
            else if (angle == 90) return 2;
            else if (90 < angle && angle < 180) return 3;
            else return 4;
        }
    }
}
