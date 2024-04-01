package com.javaex.api.objectclass.ex4;

//두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
// 얕은 복제 : 필드의 값만 동일하게 복제한 것 (프리미티브 타입일 경우)

public class Point implements Cloneable { // extends java.lang.object
	// Object가 가진 clone() 메서드를 사용하려면
	// Cloneable 인터페이스를 구현해야한다.
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getter/setter
	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
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

	// 객체를 복제해서 새로운 Point를 반환하는 메서드
	public Point getClone() {
		// 세러 셍성될 Point 객체
		Point clone = null;
		// 복제시도
		// clone 메서드 반환 타입은 Object
		try {
			//return (Point) super.clone();
			clone = (Point)clone(); // 클론 할 수 없는 상황 예외처리해야함.
		} catch (CloneNotSupportedException e) {
			// clone이 불가능한 상황에 대한 예외 처리
		}

		return clone;
	}
}
