package Second;

import java.net.Socket;

public class Client2 {
	public static void main(String[] args) {
		
		try(
				Socket socket = new Socket("localhost",30001);
				){
			
			while(true) {
				System.out.println("접속2이 완료되었습니다.");
				}
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println("클라이언트2 비정상 종료");
		}
	}
}
