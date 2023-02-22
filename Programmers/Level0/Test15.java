// 배열 원소의 길이
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4]; // 배열의 크기
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(solution.solution(str)));
    }

    static class Solution {
        public int[] solution(String[] strList) {
            int[] answer = new int[strList.length];
            int i = 0;
            for (String str : strList){
                answer[i] = str.length();
                i++;
            }
            return answer;
        }
    }
}
