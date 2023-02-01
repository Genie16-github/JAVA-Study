// [B2]거스름돈
package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5585 {
    static int cost, cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cost = 1000 - Integer.parseInt(br.readLine());
        if (cost > 0) {
            cnt += cost / 500;
            cost %= 500;
        }
        if (cost > 0) {
            cnt += cost / 100;
            cost %= 100;
        }
        if (cost > 0) {
            cnt += cost / 50;
            cost %= 50;
        }
        if (cost > 0) {
            cnt += cost / 10;
            cost %= 10;
        }
        if (cost > 0) {
            cnt += cost / 5;
            cost %= 5;
        }
        if (cost > 0) {
            cnt += cost;
        }
        System.out.println(cnt);
    }
}
