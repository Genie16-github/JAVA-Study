package Silver;// [S5]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1316 {

    private static int answer = 0;

    public static int solution(String[] arr) {
        for (String str : arr) {
            if (chechIsGroup(str)) answer++;
        }
        return answer;
    }

    private static boolean chechIsGroup(String str) {
        int[] ch = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && str.charAt(i - 1) == str.charAt(i)) {
                continue;
            } else if (ch[str.charAt(i) - 97] == 1) {
                return false;
            }
            ch[str.charAt(i) - 97] = 1;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int answer = solution(arr);
        System.out.println(answer);
    }
}
