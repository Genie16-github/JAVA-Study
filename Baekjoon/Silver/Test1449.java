package Silver;// [S3]¼ö¸®°ø Ç×½Â
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test1449 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int[] x = new int[N];
		for(int i=0; i<N; i++) {
			x[i] = sc.nextInt();
		}
		
		Arrays.sort(x);
		
		double position = x[0] - 0.5;
		int cnt = 1;
		for(int i=0; i<N ; i++) {
			if(position+L < x[i]) {
				cnt++;
				position = x[i] - 0.5;
			}
		}
		System.out.println(cnt);
	}
}