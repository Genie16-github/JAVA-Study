package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        char c = br.readLine().charAt(0);
        c = Character.toLowerCase(c);

        int cnt = 0;
        for (char x : str.toCharArray())
            if (x == c) cnt++;

        System.out.println(cnt);
    }
}
