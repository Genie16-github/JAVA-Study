// 특정 문자 제거하기
package Level0;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String letter = sc.next();
        System.out.println(solution.solution(str, letter));
    }

    static class Solution {
        public String solution(String my_string, String letter) {
            return (my_string.replace(letter, ""));
        }
    }
}
