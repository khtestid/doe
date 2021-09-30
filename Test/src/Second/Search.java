package Second;

import java.util.Arrays;

public class Search {
	
	public static void main(String[] args) {
		String[] db = new String[] {
				"자바로 배우는 프로그래밍 생활",
				"나의 자바 개발 노트",
				"자바를 위한, 자바에 의한 슬기로운 개발 블로그",
				"웹개발자가 꼭 알아야할 자바 기술 모음",
				"파이썬과 자바로 구현하는 하이엔드 프로그래밍"
			};
		
		String input = "자바";
		
		//1. 숫자를 파악 count값이 더 크다면 자리를 바꾸어라
		//2. 숫자가 count값이 같다면 
		//등장위치가 작을 수록.
//		for(String str : db) {
//		System.out.println(str);
//		}
		
		
		for(int i = db.length - 1 ; i > 0 ; i--) {
			for(int k = 0; k < i ; k++ ) {
				String temp;
				
			if(MethodTest.count_Keyword(input,db[k]) < MethodTest.count_Keyword(input,db[k+1])) {
				temp = db[k];
				db[k] = db[k+1];
				db[k+1] = temp;
			}
			
			else {
				if(MethodTest.get_Index(input,db[k]) > MethodTest.get_Index(input,db[k+1])){
					temp = db[k];
					db[k] = db[k+1];
					db[k+1] = temp;
				}
			}
				
				
			}
		}
		
		System.out.println("==========================");
		
		for(String str : db) {
			System.out.println(str);
			}
		
	}
	
}
