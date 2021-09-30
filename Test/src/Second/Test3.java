package Second;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;

public class Test3 {
public static void main(String[] args) throws IOException {
	
	/*
	 1.소켓에 대한 설명과 소켓을 생성하기 위해 필요한 정보 2가지
	 소켓이란 서버(Server)와 클라이언트(Client)간의 생성된 연결을 말한다.
	 
	 서버에서 클라이언트의 접속을 받아들이면 
	 소켓을 통하여 상호간의 데이터 입출력이 가능하다.
	 
	 소켓을 생성하기 위해서는 IP와 Port 정보가 필요하다
	 IP : 연결을 생성하기 위한 네트워크 상에 PC 식별정보
	 Port : 연결을 생성하기 위한 PC 상에 프로그램 식별정보
	

​
	 2. 
	 
	 버퍼(Bufferd) 스트림은 파일 입출력시 데이터를 한번에 모아서 처리해주는 보조 도구이다.
	 자바 특성상 파일 및 데이터 입출력 시 운영체제의 허락이(System call)이 필요한데,
	 버퍼를 통해서 System call을 줄여 이 과정을 해소할 수 있다.  
	 
	 또한 버퍼스트림을 통해서 지정된 버퍼 크기가 아닌 데이터의 입출력 크기에 따라서
	 유연하게 조절될 수 있다.(일반적으로 8192byte 크기의 버퍼가 내장되어있다.) 
	 
	 	BufferdInputStream
	 - 데이터 입력시에 생성될 수있는 보조 도구
	 
	 	BufferdOutputStream
	 - 데이터 출력시에 생성될 수있는 보조 도구
	 
	 
	 3.
	 InputStreamReader
	 문자열 데이터를 입력함에 있어서,
	 바이트 버퍼 / String 변환 등의 변환 과정이 필요한데
	 InputStreamReader가 그 기능을 대신해준다.
	 
	 그 예로 네트워크 소켓 입력에서,
	 InputStream in = socket.getInputStream;
	 을 생성하였을때 byte 단위로 입력이 되므로,
	 InputStreamReader converter = new InputStreamReader(in);
	 을 통해서 문자열로 받을 수 있게 된다.
	 
	 
	 4.
	 Stack 저장소는 후입선출 구조를 가지고 있다.
	 명령은 Queue와 마찬가지로, 
	 push(); 데이터 입력, poll(); 데이터 확인, pop(); 데이터 출력의 명령을 가지고 있으며,
	 브라우저 뒤로가기와 같은 undo 작업을 수행하는데 적합한 데이터이다.
	 즉 정보를 최신순으로 복귀할 수 있다. 
	 
	 5.
	 UDP통신
	 - 반이중 통신방식, 비연결형 통신방식이라고 부른다.
	 - 어느 한쪽이 수락하지 않아도 통신할 수 있으며, 
	 - 연결하지 않으므로 Stream생성이 필요없고 서버(Server) 및 클라이언트(Clinet)가 필요없다.
	 
	  하지만 필요한 클래스는 
	  - 전송자(Sender) : 데이터를 보내는 주체
	  - 수신자(Receiver) : 데이터를 받는 주체
	  가 있다.
	 
	 
	 6.
	 PrintWriter printer = 
	 new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
	 로 생성하며,
	 
	 PrintWriter : 입력 데이터를 문자열로 출력 / 또한 println()과 같은 열단위 출력 도구가 있다.
		BufferedWriter
	 OutputStreamWriter
	 socket.getOutputStream()
	 
	 7.
	 List : 
	 - 배열 기반의 저장소이므로 index를 가지며 데이터의 조회,삭제 처리가 빠르다.
	 - 데이터의 개별 처리 및 전체 처리 둘다 가능하다.
	 Set :
	 - 중복 데이터가 저장 될 수 없으며, 이는 HashCode와 Equals를 통한 알고리즘으로 구현하였다.
	 -- 즉 hashcode에서 값을 빠르게 비교하기 위하여 분류 후 int값을 반환한 뒤, 
	 --- 분류된 group내의 값이 같은지(equals)를 판단한다.
	 - 데이터의 전체 처리가 가능하다.
	 Map :
	 - Key와 Value가 있으며, Key는 중복값이 저장이 안되며 Value는 중복값이 저장될 수 있다.
	 - 개별처리에 특화된 저장소이다.
	 
	 위의 Collection은 모두 정렬이 가능한데,
	 1) 클래스에서 Comparable 인터페이스를 상속받아서 처리하는 방법
	 2) Comparator 인터페이스 메소드를 재정의하여 처리하는 방법이 있다.
	 
	 특히 List는 Collections.sort의 도구를 통해서 정렬할 수 있는 반면,
	 Set과 Map은 각각 TreeSet, TreeMap을 통한 이진트리 기법으로 기본적인 정렬을 할 수 있다. 
	 
	 
	 8.
	 객체 입출력을 위해서는 데이터 복구/분해 과정이 필요한데 이것을
	 ObjectInputStream , ObjectOutputStream 스트림으로 처리 할 수있다.
	 
	 	 Collections 및 Date 같은 몇몇은 자바에서 기본적으로 Serializable 인터페이스를 상속하고 있으나,
	 내가 만든 클래스는 따로 Serializable 인터페이스를 implements 해주어야한다.
	 
	 이 밖에도 변수에 transient 처리를 하여 입출력 제외 설정을 하거나,
	 버전 관리를 통해서 특정 버전에서만 사용될 수 있는 기능이 있다.
	 
	 */

}
}
