package com.javaex.api.objectclass.ex3;

import com.javaex.api.objectclass.ex2.Point;

public class Circle {
	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			// 전달 받은 파라미터 obj가 Point인지 확인
			// obj -> point로 캐스팅 한다
			Circle other = (Circle) obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다
			// return x == other.x && y== other.y; //실무에서 자주 사용
			return radius == other.radius;
			} 
		// obj가 Point가 아님
			return super.equals(obj); // 부모에게 비교 방법을 위임
	}
	
}
