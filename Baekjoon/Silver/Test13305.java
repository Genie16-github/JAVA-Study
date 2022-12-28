// [S3]주유소
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Test13305 {
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] d = new long[N - 1];	// 거리
		long[] c = new long[N];	// 비용 
		
		// 오른쪽 도시까지 거리 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N - 1; i++) {
			d[i] = Long.parseLong(st.nextToken());
		}
		
		// 리터당 기름값
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			c[i] = Long.parseLong(st.nextToken());
		}
		
		long sum = 0;
		long min_cost = c[0];	// 이전 까지의 과정 중 주유 최소 비용 
 
		for(int i = 0; i < N - 1; i++) {
			
			if(c[i] < min_cost) {
				min_cost = c[i];
			}
			
			sum += (min_cost * d[i]);
		}
		
		System.out.println(sum);
		
	}
}