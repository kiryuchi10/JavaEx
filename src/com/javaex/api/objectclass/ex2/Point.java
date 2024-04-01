package com.javaex.api.objectclass.ex2;



//두 객체의 내부 데이터의 같음을 확인하는 equals 메서드

public class Point { // extends java.lang.object
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals 두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
	// toString: 객체 정보를 문자열로 출력할 때 호출되는 메서드
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// 전달 받은 파라미터 obj가 Point인지 확인
			// obj -> point로 캐스팅 한다
			Point other = (Point) obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다
			// return x == other.x && y== other.y; //실무에서 자주 사용
			if (x == other.x && y == other.y) {
				return true;
			} else {
				return false;
			}
		}
		// obj가 Point가 아님 
					return super.equals(obj); // 부모에게 비교 방법을 위임 
		
	}

	@Override
	public String toString() {
		// System.out.println("x: %d,y: %d",x,y);
		return "x: " + x + "y:" + y;
	}
}
