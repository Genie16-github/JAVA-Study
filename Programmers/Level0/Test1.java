// 두 수의 차
package Level0;

import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution.solution(num1, num2));
    }
}
