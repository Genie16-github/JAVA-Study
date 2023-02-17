// [S4]빙고
package Silver;

import java.io.IOException;
import java.util.Scanner;

public class Test2578 {
    static int[][] board;
    static int cnt; // 빙고 개수 세는 변수

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        board = new int[5][5];
        cnt = 0;

        // 빙고판 입력
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for(int k = 1; k <= 25; k++) {
            int num = sc.nextInt();

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    if(board[i][j] == num) // 부른 숫자 0으로 바꾸기
                        board[i][j] = 0;
                }
            }

            rCheck();
            cCheck();
            lrCheck();
            rlCheck();

            if(cnt >= 3) { // 3줄 이상 빙고이면 몇 번째 숫자인지 출력하고 종료
                System.out.println(k);
                break;
            }
            cnt = 0;
        }
    }

    //가로 체크
    public static void rCheck() {
        for(int i = 0; i < 5; i++) {
            int zerocnt = 0;
            for(int j = 0; j < 5; j++) {
                if(board[i][j] == 0)
                    zerocnt++;
            }
            if(zerocnt == 5)
                cnt++;
        }
    }

    // 세로 체크
    public static void cCheck() {
        for(int i = 0; i < 5; i++) {
            int zerocnt = 0;
            for(int j = 0; j < 5; j++) {
                if(board[j][i] == 0)
                    zerocnt++;
            }
            if(zerocnt == 5)
                cnt++;
        }
    }

    // 왼쪽에서 오른쪽으로 그어지는 대각선 체크
    public static void lrCheck() {
        int zerocnt = 0;
        for(int i = 0; i < 5; i++) {
            if(board[i][i] == 0)
                zerocnt++;
        }
        if(zerocnt == 5)
            cnt++;
    }

    // 오른쪽에서 왼쪽으로 그어지는 대각선 체크
    public static void rlCheck() {
        int zerocnt = 0;
        for(int i = 0; i < 5; i++) {
            if(board[i][4-i] == 0)
                zerocnt++;
        }
        if(zerocnt == 5)
            cnt++;
    }
}
