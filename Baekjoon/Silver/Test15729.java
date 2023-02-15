// [S2]방탈출
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test15729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] start = new int[N]; // 시작 배열
        int[] end = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) end[i] = Integer.parseInt(st.nextToken());

        int count = 0;   // 총 누른 스위치 횟수를 저장할 변수
        int chk = 0;   //초기 배열과 주어진 배열의 다른 위치를 체크할 변수
        while(true) {
            boolean flag = false;
            for(int i = 0; i < N; i++) {
                if(end[i] == start[i]){
                    flag = true;    // 배열이 같을 경우 flag 는 계속 true
                }else {             // 배열이 다를경우 flag 는 false 가 되고 다른 지점에 저장
                    flag = false;
                    chk = i;
                    break;
                }
            }

            if(flag) {     // 두 배열이 같을 때
                System.out.println(count);
                break;
            }

            count++;       // 버튼을 누름
            for(int i = chk; i < chk + 3; i++) {
                if(i > N - 1) {      // 배열 크기 초과
                    break;
                }

                start[i] = 1 - start[i];       // 0을 1로 1은 0으로
            }
        }
    }
}
