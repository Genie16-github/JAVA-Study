// 배열 뒤집기
package Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(solution.solution(num)));
    }

    static class Solution {
        public int[] solution(int[] num_list) {
            int l = num_list.length;
            int[] answer = new int[l];
            for(int i = l-1; i > -1 ; i--){
                answer[i] = num_list[l-1-i];
            }
            return answer;
        }
    }
}
