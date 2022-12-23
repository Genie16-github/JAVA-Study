// [S3]¾ÈÅ×³ª
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test18310{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			nums.add(sc.nextInt());
		}
		
		Collections.sort(nums);
		
		int center = (n-1) / 2;
		
		System.out.println(nums.get(center));
	}
}