package first;

public class Mytest {
	
	/*
	1.원시형 자료형의 종류
	정수형 : byte(1byte), short(2byte) , int(4byte) , long(8byte)
	실수형 : float(4byte), double(8byte)
	문자형 : char(2byte)
	논리형 : boolean(1byte)
	
	
	2. 
	다형성이란, 클래스에서 상속 및 오버라이딩에 대한 중요한 특성을 지닌다.
	한가지의 객체가 다양한 형태(자료형이며, extends or implements된 경우)로 표현 될 수 있으며,
	이를 업캐스팅(upcasting)이라고 한다. 객체는 그 형태에 맞게 기능을 수행하게 된다.
	반대로 하나의 자료형으로 다양한 형태의 객체를 생성할 수 있으며, 특정 기능(메소드)을 다른 방식으로 사용할 수 있는 것을 말한다.
	
	예시로는, 여러가지 치킨 종류는 여러가지 객체이고 이는 치킨으로 묶일 수 있다.
	따라서 치킨 C = new 양념치킨(); 치킨 C2 = new 간장치킨(); 으로 표현될 수 있다.
	다른 예시로는 주차공간 하나에는 여러가지 자동차가 주차될수 있다.
	주차공간 P = new 소나타공간(); 주차공간 P2 = new 모닝공간(); 이렇게 표현될 수 있다.  
	
	3.
	1) 예약어 사용이 불가능
	2) 숫자로 시작할 수 없다
	3) 띄어쓰기가 불가능 하다.
	
	4.
	자바에서 상속이란 완성된 코드(클래스)를 활용하여 그 기능을 사용 또는 재정의 사용하여 개발 효율을 높일 수 있게한다. 
	즉 extends를 이용하여 자식객체가 부모객체의 속성 및 기능을 손쉽게 사용가능하며,
	필요시 오버라이딩을 통해서 기능을 수정하여 유연하게 사용할 수 있게 해준다.
	
	예시로는,
	Apple클래스가 Farm클래스를 상속하며,
	Eatable 인터페이스를 상속받는다.
	
	여기서 Farm클래스에 추상 메소드 feed를 자식 클래스인 Apple이 재정의 할 수 있고,
	부모클래스의 멤버 변수를 가지며 생성자를 통해서 초기값 또한 가질 수 있다.
	
	또한 Eatable 인터페이스를 통해서 먹을 수 있는지 없는지를 mark할 수 있으며,
	추상 메소드가 있다면 Farm의 부모클래스와 같이 재정의(override)하여 사용할 수 있다.
	
	}
	
	6.큐란?
	큐는 선입선출구조를 지닌 저장소이며,
	push();로 데이터 입력 poll();데이터의 확인 pop();으로 데이터 출력을 할 수 있다.
	예시로는 게임이나 사이트의 접속자수가 많을때 대기열에서 먼저온 사용자들을 순차적으로 접속시키게 할 수 있다.
	
	/*
	 * [ 네트워크 프로그래밍 - 서술형 ]
문제1. 파일 정의
     //파일이란?
     //글자를 보관하기 위한 저장공간.
     //=파일의 크기는 파일 안에 들어있는 글자의 크기.
     
     //1.의미있는 글자를 보관하기 위한 파일(어떤 프로그램에서든 읽을 수 있는 일반적인 글자)
     //--> 텍스트 파일
     //2. 특정 프로그램에서만 이해할 수 있는 파일.(엑셀, 자바 에서만 해석되는 파일이 있다)
     //--> 바이너리 파일
     
     //File 클래스에서는 물리 저장소에 존재하는 파일을 제어할 수 있다.
     // = 해당하는 파일의 객체를 생성해야 제어가 가능하며, 생성을 위해서는 반드시 정보가 필요하다.
     
     //파일 -> 위치정보와 이름은 있어야 지목할 수있다.
문제2. 네트워크 정의
네트워크
원하는 정보를 원하는 수신자 또는 기기에 정확하게 전송하기 위한 기반 인프라
OSI 7 Layer
국제 표준화 기구인 ISO에서 개발한 네트워크 계층 표현 모델
​
​
문제3. File class의 명령어, 데이터 종류에 따른 입출력 스트림을 작성하세요.
exists(); 파일 객체가 있는지
getName();   getPath();      getAbsolutePath();
length();      lastModified();   isHidden()   canWrite()
디렉터리 대부분 같고
listFiles();로 파일 배열 객체 생성
isFile()   isDirectory();
디렉터리
getParentFile(); //상위 파일
디렉터리 생성 mkdirs();      // 파일생성 createNewFile();
delete(); 삭제
​
싱글 바이트 입출력
FileInputStream    FileOutputStream
멀티 바이트 입출..    (((이건 카톡 사진으로 전송)))
​
문제4. Buffer의 특징, 종류, 크기에 대해 설명하세요.
Buffer란 데이터 입출력시 임시 보관소이며 버퍼의 크기를 설정하여 운영체제의 허락을 적게 받고 한번에 많은 데이터를
 입출력하기 위한 보조 도구이다. 버퍼의 크기는 무조건 크다고 좋은것이 아니고 적당한 크기가 필요하다. 일반적으로
 1024의 배수로 설정하고 미설정 시 자바의 기본 버퍼설정 크기는 8192이다
​
문제5. TCP에 대해 설명하세요.
- 전이중 통신방식, 쌍방향, 연결형 통신
- 클라이언트(Client) : 연결을 시도하는 주체 와 서버(Server) : 연결을 수락하는 주체 간의 통신이며
반드시 서버가 먼저 열려야 클라이언트에서 접속 할 수 있다.
IP : 연결 생성을 위한 네트워크상에서의 PC 식별정보
Port : 연결 생성을 위한 PC 내에서의 프로그램 식별정보
​
문제6. Socket에 대해 설명하세요.
소켓은 클라이언트와 서버간에 생성된 연결을 의미하며
서버에서 클라이언트의 접속을 받아들이면 소켓이 생성되어 상호간의 데이터 입출력이 가능하다.
​
문제7. TCP통신에 사용되는 Stream의 종류를 작성하세요.
TCP통신에 사용되는 Stream에는 Socket에서
출력을 담당하는 OutputStream이 있고, socket.getOutputStream으로 생성한다.
입력은 InputStream이며, socket.getInputStream으로 생성한다.
​
또한 파일과 byte전송이 아닌 채팅과 같은 문자열 전송에 있어서는
OutputStreamWriter 및 OutputStreamReader를 통해 문자열 입출력 형식으로 변환시키는 스트림을 추가할 수 있다.
​
문제8. UDP에 대해 설명하세요.
- 반이중 통신방신, 비연결형 통신
- 어느 한쪽이 수락하지 않아도 전송되는 방식
- 연결하지 않기 떄문에 Stream이 필요 없다.(서버와 클라이언트도 필요 없음)
비연결형 통신 : UDP
전송자(Sender) : 데이터를 보내는 주체
수신자(Receiver) : 데이터를 받는 주체
유니캐스트(Unicast) : 일대일 메세지 전송 방식
멀티캐스트(Multicast) : 특정 채널에 소속된 대상에게만 메세지를 보내는 방식(ex : 카톡 그룹채팅)
브로드캐스트(Broadcast) : 전체에게 메세지를 보내는 방식(ex : 공지사항, 방송)
	 * 
	 */

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 100; i++) {
			if(i%2 ==0) System.out.println(i);
		}
	}

}
