package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}
//	public void setWidth(int width) {
//		this.width=width;
//	}
//	public int getWidth() {
//		return width;
//	}
//	public void setHeight(int height) {
//		this.height=height;
//	}
//	public int getHeight() {
//		return height;
//	}
//
	public int area() {
		return width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			// 전달 받은 파라미터 obj가 Point인지 확인
			// obj -> point로 캐스팅 한다
			Rectangle other = (Rectangle) obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다
			// return x == other.x && y== other.y; //실무에서 자주 사용
			return area() == other.area();
		}
		// obj가 Point가 아님
		return super.equals(obj); // 부모에게 비교 방법을 위임
		
		//	모든 개체의 최상위에는 object가 있다
		//	1.객체의 생성자에서 부모 생성자를 명시적으로 호출하지 않으면,
		// 자바 임의로 부모
	}
}
