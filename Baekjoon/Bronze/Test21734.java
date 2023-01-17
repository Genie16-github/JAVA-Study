// [B2]SMUPC의 등장
package Bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test21734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split("");
        for (String a : data) {
            int c = a.charAt(0);
            int num = 0;
            
            while(c != 0){
                num += c % 10;
                c /= 10;
            }
            
            for (int i = 0; i < num; i++) {
                System.out.print(a);
            }
            System.out.println();
        }

    }
}
