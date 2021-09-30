package Second;

public class MethodTest {

	public static int count_Keyword(String input, String data) {
		int count = 0;
		int start = 0;
		
		while(true) {
			if(data.indexOf(input) < 0) break;
			start += input.length();
			count++;
		}
		return count;
	}
	
	public static int get_Index(String input, String data) {
		return data.indexOf(input);
	}
	
}
