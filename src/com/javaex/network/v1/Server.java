package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// 서버 소켓 생성
		ServerSocket serverSocket = null;
		try {
		
		// ip와 포트에 연결 : blind
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1",10000);
			
			System.out.println("< 서버가 시작됬습니다.");
			System.out.println("[ 연결을 기다립니다].");
		// 연결 대기
			serverSocket.bind(local);
			Socket socket= serverSocket.accept();
			
		// 접속 허용
			InetSocketAddress socketAddress=
					(InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라인트가 연결되었습니다]");
			System.out.println(socketAddress.getAddress()+ ":"+
					socketAddress.getPort());
		// 후처리
		System.out.println("================");
		System.out.println("<서버 종료>");
		}finally {
			try {
				serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
