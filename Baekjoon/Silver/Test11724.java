package Silver;

// [S2]

import java.util.*;

public class Test11724 {
	
	static int[][] graph = new int[1001][1001];
	static int V, E;
	static boolean[] visited = new boolean[1001];
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		int a,b;
		for(int i = 0; i < E; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			// �׷��� ���� ����
			graph[a][b] = graph[b][a] = 1;
		}
		
		int result = 0 ;
		
		for(int i = 1; i <= V; i++) {
			if(visited[i] == false) { 
				dfs(i);
				result++;
			}
		}
		
		System.out.println(result);
		
		sc.close();
		return;
	}
	
	public static void dfs(int idx) {
		if(visited[idx] == true)
			return;
		else {
			visited[idx] = true;
			for(int i = 1; i <= V; i++) {
				if(graph[idx][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}