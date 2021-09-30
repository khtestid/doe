package Second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyTest2 {
	public static void main(String[] args) {
		Set<String> a = new TreeSet<String>();//전화번호부
		List<String> b = new ArrayList<String>();//통화내역
		String[] c = new String[6];
		
		a.add("아이유");			b.add("아이유");			c[0] = "아이유";
		a.add("태연");			b.add("태연");			c[1] = "태연";
		a.add("박보영");			b.add("박보영");			c[2] = "박보영";
		a.add("차은우");			b.add("차은우");			c[3] = "차은우";
		a.add("한지민");			b.add("한지민");			c[4] = "한지민";
		a.add("김을동");			b.add("김을동");			c[5] = "김을동";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(Arrays.toString(c));
		//완료 후 자바 복습, 문제풀이
		//이것도 완료후 프로그래머스
		//오라클 책
	}
}
