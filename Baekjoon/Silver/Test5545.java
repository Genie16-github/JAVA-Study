// [S3]최고의 피자
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test5545 {
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 토핑의 종류
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 도우의 가격 A
        int B = Integer.parseInt(st.nextToken()); // 토핑의 가격 B
        int C = Integer.parseInt(br.readLine());  // 도우의 열량 C
        arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 토핑의 열량 Di
        }

        int res = C / A;

        Arrays.sort(arr, Collections.reverseOrder());

        int tmpPrice = A;
        int tmpKCal = C;
        for(int i = 0; i < N; i++) {
            tmpPrice += B;
            tmpKCal += arr[i];
            int tmp =  tmpKCal / tmpPrice;
            if(res > tmp) {
                break;
            }else {
                res = tmp;
            }
        }
        System.out.println(res);




    }
}
