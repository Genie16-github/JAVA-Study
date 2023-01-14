package Silver;

// [S2]팰린드롬 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int res = s.length();

        for(int i = 0 ; i < s.length() ; i++){
            if(isPalind(s.substring(i))){
                break;
            }
            res++;
        }
        System.out.println(res);
    }

    private static boolean isPalind(String s) {
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            if (s.charAt(start) != s.charAt(last))
                return false;
            start++;
            last--;
        }
        return true;
    }
}
