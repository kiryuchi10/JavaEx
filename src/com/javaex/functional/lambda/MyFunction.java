package com.javaex.functional.lambda;

public interface MyFunction {
	//함수형 인터페이스 -내부에 반드시 1개의 메서드만 허용
		int getResult(int x, int y); //추상 메서드 
		//내부 로직 설계시에 미정상태로 둔다. 
}
