// 머쓱이보다 키 큰 사람
package Level0;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4]; // 배열의 크기
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int height = sc.nextInt();
        System.out.println(solution.solution(num, height));
    }

    static class Solution {
        public int solution(int[] array, int height) {
            int answer = 0;
            for (int h : array){
                if (h > height) answer++;
            }
            return answer;
        }
    }
}
