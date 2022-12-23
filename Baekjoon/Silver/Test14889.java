// [S2]��ŸƮ�� ��ũ
import java.util.*;
public class Test14889 {
	
	static int n;
	static int board[][] = new int[21][21];
	static boolean check[] = new boolean[21];
	static int res = 2147000000;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		dfs(1,0);
		
		System.out.println(res);
	}
	
	public static void dfs(int idx, int v) {
		
		if(v == n/2) {
			int first = 0;
			int second = 0;
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(check[i] && check[j]) first += board[i][j];   // ù��° ��
					if(!check[i] && !check[j]) second += board[i][j];  // �ι�° ��
				}
			}
			
			if(res > Math.abs(first-second)) res = Math.abs(first-second);
			
			return;
		}
		
		for (int i = idx; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				dfs(i+1, v+1);
				check[i] = false;
			}
		}
		
	}
	
}