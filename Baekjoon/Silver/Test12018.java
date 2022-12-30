// [S3]Yonsei TOTO
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test12018 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			if(p>=l) { // 신청 인원 >= 수강 인원
				int[] sub = new int[p];
				for(int j=0; j<p; j++) sub[j] = Integer.parseInt(st.nextToken());
				Arrays.sort(sub);
				arr[i] = sub[p-l];
			}else { // 수강인원보다 신청한 사람이 적으면 마일리지를 많이 쓸 필요X
				arr[i] = 1;
			}
		}
		Arrays.sort(arr); // 필요 마일리지 오름차순 정렬
		
		int cnt = 0;
		for(int i=0; i<n; i++) {  // 보유 마일리지를 넘지 않는 선까지 계속 합
			if(arr[i]>m) break;
			m -= arr[i];
			cnt++;
		}
		
		System.out.println(cnt);
	}
}