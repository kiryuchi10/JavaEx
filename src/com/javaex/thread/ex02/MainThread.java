package com.javaex.thread.ex02;

public class MainThread  {

	public static void main(String[] args) {
		DigitThread thread = new DigitThread();
		// MainThread 로직
		// A~Z까지 차례대로 출력
		
		thread.setName("DigitThread");
		//thread 시작
				// -> .start() 메서드 호출
				// 쓰레드의 우선순위
				// 1. (MIN)~5(Normal)~10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
		//thread.start();
		
		
	
		//DigitThread thread =new DigitThread();
		//thread.setName("DigitThread");
		thread.start();
//		for(char ch ='A';ch<='Z';ch++) {
//			System.out.println(ch);
//			//쓰레드 실행 대기
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		Thread runnableThread = new Thread(new AlphabetRunnable());
		runnableThread.setName("AlphabetRunnable");
		runnableThread.setPriority(Thread.MIN_PRIORITY);
		runnableThread.start();
		//thread와 runnableThread의 흐름을 main 쓰레드의 흐름 합류
		
		System.out.println("메인쓰레드 종료");
		
		try {
			thread.join();
			runnableThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//쓰레드 상속
		/*
		 * String []list =new String []{"A","B","C"}; System.out.println(list);
		 */
		
		//runnable 구현
	}

}
