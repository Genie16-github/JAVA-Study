// 옷가게 할인 받기
package Level0;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution.solution(num));
    }

    static class Solution {
        public int solution(int price) {
            if(price>=500000) {
                price*=0.8;
            } else if(price>=300000) {
                price*=0.9;
            } else if(price>=100000) {
                price*=0.95;
            }
            return price;
        }
    }
}
