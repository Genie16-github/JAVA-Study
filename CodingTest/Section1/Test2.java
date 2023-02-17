package Section1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder res = new StringBuilder();
        for (char x : str.toCharArray()){
            if (Character.isLowerCase(x)) res.append(Character.toUpperCase(x));
            else res.append(Character.toLowerCase(x));
        }

        System.out.println(res);
    }
}
