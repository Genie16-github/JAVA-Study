package Section1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
            // indexOf(x)를 하면 가장 먼저 보이는 x의 index 가 나온다.
        }
        System.out.println(answer);
    }
}
