// [S4]궁합 쌍 찾기
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Test14911 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] arr = new int[str.length];  // 입력받은 수만큼 정수 배열 생성
        for (int i = 0; i < str.length; i++)
            arr[i] = Integer.parseInt(str[i]);

        int sum = Integer.parseInt(br.readLine());
        Arrays.sort(arr);  // 입력받은 수 정렬
        StringBuilder sb = new StringBuilder();
        
        HashSet<String> check = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    String res = arr[i] + " " + arr[j];
                    if (check.contains(res)) continue;  // a==c && b==d인 경우 패스
                    check.add(res);
                    sb.append(res).append('\n');
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
