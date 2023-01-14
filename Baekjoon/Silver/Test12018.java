package Silver;

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
			
			if(p>=l) { // ��û �ο� >= ���� �ο�
				int[] sub = new int[p];
				for(int j=0; j<p; j++) sub[j] = Integer.parseInt(st.nextToken());
				Arrays.sort(sub);
				arr[i] = sub[p-l];
			}else { // �����ο����� ��û�� ����� ������ ���ϸ����� ���� �� �ʿ�X
				arr[i] = 1;
			}
		}
		Arrays.sort(arr); // �ʿ� ���ϸ��� �������� ����
		
		int cnt = 0;
		for(int i=0; i<n; i++) {  // ���� ���ϸ����� ���� �ʴ� ������ ��� ��
			if(arr[i]>m) break;
			m -= arr[i];
			cnt++;
		}
		
		System.out.println(cnt);
	}
}