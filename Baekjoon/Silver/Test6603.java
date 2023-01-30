// [S2]로또
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6603 {
    static int k;
    static int [] s;
    static boolean [] chk;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String nums = br.readLine();
            if(nums.equals("0")) break;
            String [] input=nums.split(" ");
            k = Integer.parseInt(input[0]);
            s = new int[k];
            chk = new boolean[k];

            for(int i = 0; i < k; i++){
                s[i] = Integer.parseInt(input[i+1]);
            } //초기 값 세팅

            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int depth, int start){
        if(depth == 6){
            for(int i = 0; i < k; i++){
                if(chk[i]){
                    System.out.print(s[i] + " ");
                }
            }
            System.out.println();
        }
        for(int i = start; i < k; i++){
            chk[i] = true;
            dfs(depth+1,i+1);
            chk[i] = false;
        }
    }
}
