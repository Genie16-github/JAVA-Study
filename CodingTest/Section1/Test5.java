package Section1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        res = String.valueOf(s);

        System.out.println(res);
    }
}
