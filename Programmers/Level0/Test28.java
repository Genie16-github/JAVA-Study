// 중복된 숫자 개수
package Level0;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Solution st = new Solution();
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; // 배열의 크기
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(st.solution(num, n));

    }

    static class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            for(int a : array){
                if(a == n) answer++;
            }
            return answer;
        }
    }
}
