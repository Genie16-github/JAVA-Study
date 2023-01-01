// [S3]단어 뒤집기2
import java.util.*;
import java.io.*;
	
public class Test17413 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
	
		String str = br.readLine();
		int len = str.length();

		boolean tag = false;		// <> 체크
		for(int i=0; i<len; i++) {
	
			if(str.charAt(i) == '<') {
				tag = true;
	
				while( !stack.isEmpty() ) {  // 스택 초기화
					sb.append(stack.pop());
				}
	
				sb.append(str.charAt(i));
			}
			
			else if(str.charAt(i) == '>') {
				tag = false;
				sb.append(str.charAt(i));
			}
			
			else if(tag == true) {     // < 안 문자 -> 그대로 스택에 입력
				sb.append(str.charAt(i));
			}

			else if( tag == false) {     // 뒤집어야할 문자열
				if(str.charAt(i) == ' ') {
	
					while( !stack.isEmpty() ) {
						sb.append(stack.pop());
					}
	
					sb.append(str.charAt(i));
				}
				// 공백이 아니면, 스택에 계속 푸시
				else {
					stack.push(str.charAt(i));
				}
			}
		}

		while( !stack.isEmpty() ) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}
}