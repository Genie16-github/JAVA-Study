package Silver;

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
            // ���� 1�̸� 1�� �����Ѵ�.
            if (B % 10 == 1) B /= 10;
            // 2�� ������ �������� 2�� ������.
            else if (B % 2 == 0) B /= 2;
            // �� ���� ���� A�� B�� �ٲ� �� ���� ������ -1�� ����Ѵ�.
            else {
                System.out.println(-1);
                System.exit(0);
            }
            
            cnt++;
        }
        
        System.out.println(cnt);
    }
}