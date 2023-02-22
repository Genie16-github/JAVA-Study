// 문자 반복 출력하기
package Level0;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(solution.solution(str, n));
    }

    static class Solution {
        public String solution(String my_string, int n) {
            StringBuilder sb = new StringBuilder();
            char[] arr = my_string.toCharArray();
            for(int i = 0; i < my_string.length(); i ++){
                sb.append(String.valueOf(arr[i]).repeat(n));
            }
            return sb.toString();
        }
    }
}
