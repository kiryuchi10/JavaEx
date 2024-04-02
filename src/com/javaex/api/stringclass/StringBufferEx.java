package com.javaex.api.stringclass;

public class StringBufferEx {
	public static void main(String[] args) {
		// string은 immutable
		// stringbuffer는 내부에 버퍼를 두고, 버퍼에서 작업
		// 최종 소비되는 시점에서 문자열로 반환
		// 메모리 관리 측면에서 string 보다 유리

		// 버퍼 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		System.out.println(sb.length());

		// 문자열 추가 :append
		sb.append(" is a pencil");
		System.out.println(sb);

		sb.insert(7, " my");
		System.out.println(sb);

		// 메서드 체이닝: 메서드를 연속적으로 호출, 객체를 변화시키는 방법
		StringBuffer sb2 = new StringBuffer("this").append(" is my pencil").insert(7, " my").replace(7, 10, " your");
		System.out.println(sb2);

	}
}
