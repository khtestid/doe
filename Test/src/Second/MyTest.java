package Second;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MyTest {

	/*
	 원인 : 변수 작명법이 잘못되었다.
	 1. int daily selling price = 5000;
	 - 변수는 띄워쓰기가 안된다.
	 2. int 100count = 0;
	 - 변수명에 시작으로 숫자를 쓸 수 없다.
	 
	 조치내용 one: 
	 자바에서는 영어의 대,소문자를 구분하므로 카멜표기법을 쓸 수 있다.
	 1.int dailySellingPrice = 5000;
	 2.int hundredCount = 0;
	 //숫자로 시작이 불가능하므로 숫자를 영어로 번역하여 작명.
	 
	 조치내용 Two:
	 언더바스코어(_)를 이용한 스네이크 표기법도 가능하다
	 1.int daily_selling_price = 5000;
	 2.int hundred_count = 0;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */

	public static void main(String[] args) {
		Random r = new Random();

		int[] lottoNumbers = new int[6];

		for(int i=0; i < lottoNumbers.length; i++){

		lottoNumbers[i] = r.nextInt(45)+1;
	
		
		}
		/*
		주요 원인 1 : 배열의 크기가 지정되지 않았다.(또는 크기가 0이다.)
		 int[] lottoNumbers = new int[]{};
		 
		추가 원인 2 : 로또의 숫자가 0부터 44까지 랜덤으로 입력되여 45는 들어가지 않고 0이 들어갈 수 있게 된다. 
		 lottoNumbers[i] = r.nextInt(45);
		 
		추가 원인 3 : 로또는 결과값 6개가 오름차순으로 표시되어야 하는데 그 기능이 없다. 
		 
		주요 조치내용 1 : 배열의 크기를 6개로 지정해준다.
		 int[] lottoNumbers = new int[6];
		 
		 추가 조치내용 2 : 랜덤수 생성에 +1(시작값)을 해준다.
		 lottoNumbers[i] = r.nextInt(45) + 1;
		 
		 추가 조치내용 3 : 마지막에 정렬(Bubble Sort방법)을 해준다.
		 for(int i = lottoNumbers.length - 1 ; i > 0 ; i--) {
			for(int k = 0 ; k < i ; k++) {
				int temp;
				if(lottoNumbers[k]>lottoNumbers[k+1]) {
					temp = lottoNumbers[k];
					lottoNumbers[k] = lottoNumbers[k+1];
					lottoNumbers[k+1] = temp;
				}
			}
		}
		 */
		
		Arrays.toString(lottoNumbers);
		System.out.println(lottoNumbers.length);
		System.out.println(lottoNumbers);
		System.out.println(lottoNumbers.toString());
		
		System.out.println(Arrays.toString(lottoNumbers));
		//toArrays 명령..
		
		for(int i = lottoNumbers.length - 1 ; i > 0 ; i--) {
			for(int k = 0 ; k < i ; k++) {
				int temp;
				if(lottoNumbers[k]>lottoNumbers[k+1]) {
					temp = lottoNumbers[k];
					lottoNumbers[k] = lottoNumbers[k+1];
					lottoNumbers[k+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(lottoNumbers));
		
}
}
