package Silver;

// [S3]

import java.io.IOException;
import java.util.*;

public class Test2012{
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] p_rank = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			p_rank[i] = sc.nextInt();
		}
		
		Arrays.sort(p_rank);
		
		long res = 0;
		for(int i=1; i<p_rank.length;i++) {
			res += Math.abs(i-p_rank[i]);
		}
		
		System.out.println(res);
	}
}