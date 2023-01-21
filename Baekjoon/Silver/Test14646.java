// [S5]욱제는 결정장애야!!
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14646 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100001];
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 0;

        String nums = br.readLine();
        StringTokenizer st = new StringTokenizer(nums);
        for(int i =  1; i <= num*2; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(arr[tmp] == 0){
                sum++;
                arr[tmp]++;
            }
            else sum--;

            if(sum > max) max = sum;
        }
        System.out.println(max);
    }
}
