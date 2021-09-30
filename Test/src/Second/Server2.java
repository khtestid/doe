package Second;

import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public static void main(String[] args) {
		try(
		ServerSocket server = new ServerSocket(135);
		){
			System.out.println("서버 오픈2");
			while(true) {
			try(
				Socket socket = server.accept();	
					){
				System.out.println("손님 입장2");
				System.out.println(socket.toString());
			}
			
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			System.err.println("서버 비정상 종료2");
		}
		
	}
}
