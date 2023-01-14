package Silver;

// [S3]

import java.util.*;

public class Test10974{
	static int n, arr[], isSelected[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n];
		isSelected = new int[n];
		
		dfs(0);
	}
	
	static void dfs(int v) {
		if(v == n) {
			for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		
		for(int i=0 ; i<n; i++) {
			if(isSelected[i]==1)
				continue;
			arr[v] = i+1;
			isSelected[i] = 1;
			dfs(v+1);
			isSelected[i] = 0;
		}
	}
}