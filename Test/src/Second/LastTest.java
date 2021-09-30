package Second;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LastTest {
	public static void main(String[] args) throws IOException {
		
//		Socket socket = new Socket();
//		
//		InputStream in = socket.getInputStream();
//
//		InputStreamReader converter = new InputStreamReader(in);
//		
//		BufferedReader buffer = new BufferedReader(converter);
		
		/*
		 1.
		 주요 원인 : 싱글 byte 형태로 입력을 받았다.
		 InputStream in = socket.getInputStream();
		 =========================================================
		 추가 원인 : byte 형태를 다루는 보조 버퍼스트림을 사용하였다.
		 BufferedInputStream buffer = new BufferedInputStream(in);

		 
		 주요 조치 내용 : byte 데이터를 문자열 데이터 변환하여 받을 수 있는 도구를 사용한다. 
		 InputStream in = socket.getInputStream();
		 InputStreamReader converter = new InputStreamReader(in);
		 =========================================================
		 추가 조치 내용 : 문자열 데이터를 다루는 보조 버퍼스트림을 사용한다.
		 BufferedReader buffer = new BufferedReader(converter);
		 
		 <작성한 코드>

ServerSocket server = new ServerSocket(30000);

Socket socket = server.accept();

<발생한 오류메세지>

Exception in thread "main" java.net.BindException: Address already in use: JVM_Bind
		 
		 
		 //주요 원인 : 서버는 port당 한 개만 열 수 있다. 그런데 위와 같이 발생한 오류는
		  1)이미 사용되고 있는 port번호 이거나,
		  2)현재 사용하고 있는 서버가 종료되지 않고 열려있는 상태에서 다시 해당 서버를 열었기 때문에 발생한 오류이다. 
		 
		 //주요 조치 내용 :
		 
		 1) 사용되고 있는 port를 확인하여 사용되고 있지 않는 서버 port를 사용한다.
		 	for(int i=0; i <= 65535; i++) {
			try {
				ServerSocket server = new ServerSocket(i);
			} catch (IOException e) {
				System.out.println("사용중인 번호 : " + i);
			}
		}
		 2) 기존에 사용하던 port로 서버를 재오픈 하고싶은 경우
		 콘솔창에 마우스 우클릭으로 Terminate/Disconnect All을 눌러 모든 서버와 클라이언트를 종료 시킨 후,
		 다시 서버를 오픈하면 된다.
		 또는, 작업관리자나 cmd에서 서버 port를 확인하여 프로세스를 강제로 종료시킨 후 다시 서버를 오픈하면 된다.
		 

		 
		 *
		 *
		 *
		 *
		 */
		for(int i=0; i <= 65535; i++) {
			try {
				ServerSocket server = new ServerSocket(i);
			} catch (IOException e) {
				System.out.println("사용중인 번호 : " + i);
			}
		}
	}
}
