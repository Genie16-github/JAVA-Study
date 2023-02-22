// 문자열 뒤집기
package Level0;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution.solution(str));
    }

    static class Solution {
        public String solution(String my_string) {
            StringBuilder sb = new StringBuilder(my_string);
            return sb.reverse().toString();
        }
    }
}
