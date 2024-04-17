package com.javaex.thread.ex01;

public class MainThread  {

	public static void main(String[] args) {
		// MainThread 로직
		// A~Z까지 차례대로 출력
		DigitThread thread =new DigitThread();
		thread.setName("DigitThread");
		thread.start();
		for(char ch ='A';ch<='Z';ch++) {
			System.out.println(ch);
			//쓰레드 실행 대기
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("메인쓰레드 종료");
		
		//쓰레드 상속
		/*
		 * String []list =new String []{"A","B","C"}; System.out.println(list);
		 */
		
		//runnable 구현
	}

}
