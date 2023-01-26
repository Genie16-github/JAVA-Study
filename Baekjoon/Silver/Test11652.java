// [S4]카드
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test11652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> cards = new HashMap<>();

        int max = 0;
        long tmp = 0;
        for (int i = 0; i < N; i++) {
            long card = Long.parseLong(br.readLine());
            
            // 입력 숫자와 해당 숫자 index put
            cards.put(card, cards.getOrDefault(card, 0) + 1);

            if (cards.get(card) > max) {
                max = cards.get(card);
                tmp = card;
            } else if (cards.get(card) == max) {
                tmp = Math.min(tmp, card);
            }
        }

        System.out.println(tmp);
    }
}
