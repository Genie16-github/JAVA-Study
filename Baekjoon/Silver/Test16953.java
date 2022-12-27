// [S2]A -> B
import java.io.*;
import java.util.*;

public class Test16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 1;
        
        while (A != B){
            if (B < A) {
                System.out.println(-1);
                System.exit(0);
            }
            // 끝이 1이면 1을 제거한다.
            if (B % 10 == 1) B /= 10;
            // 2로 나누어 떨어지면 2로 나눈다.
            else if (B % 2 == 0) B /= 2;
            // 그 밖의 경우는 A를 B로 바꿀 수 없기 때문에 -1을 출력한다.
            else {
                System.out.println(-1);
                System.exit(0);
            }
            
            cnt++;
        }
        
        System.out.println(cnt);
    }
}