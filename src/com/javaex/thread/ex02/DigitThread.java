package com.javaex.thread.ex02;

public class DigitThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// working logic : 0~30까지 숫자를 출력
		for(int i =0;i<30;i++) {
			System.out.printf("%s: %d%n",getName(),
					i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메인쓰레드 종료");
	}

}
