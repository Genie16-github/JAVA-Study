package Section1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            String str = new StringBuilder(sc.next()).reverse().toString();
            System.out.println(str);
        }
    }
}
