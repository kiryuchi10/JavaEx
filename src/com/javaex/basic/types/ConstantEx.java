package com.javaex.basic.types;

import java.util.Calendar;

public class ConstantEx {

	public static void main(String[] args) {
		//상수는 변하지 않는 수 
		//초기화, 조회 가능, 재할당 불가
		final double pi =3.14159;
		final int SPEED_LIMIT=110;
		
		System.out.println(pi);
		System.out.println(SPEED_LIMIT);
		
		//SPEED_LIMIT=100; //speed limit can not be reassigned
		System.out.println("현재 제한 속도는 " +SPEED_LIMIT+"입니다.");
		System.out.println("제한속도 " +SPEED_LIMIT+" 이하로 주행해 주세요.");
		
		// 상수의 사용 목적
		// 		1. 코드의 가독성을 높인다
		//		2.특정 데이터를 한 곳에서 일괄 관리 
		//		3.코드를 변경할 수 없다 (불변성)
		System.out.println(Calendar.JANUARY);
	}

}
