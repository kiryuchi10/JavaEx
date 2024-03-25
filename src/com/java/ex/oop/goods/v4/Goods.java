package com.java.ex.oop.goods.v4;

public class Goods {
	// 생성자를 하나도 선언하지 않을 경우
	//자바 컴파일러가 기본생성자를 추가
	//개발자가 생성자를 만들었을 경우,
	//기본 생성자는 추가 되지 않는다
	//생성자
		//getter, setter 가 없으면 read only 필드를 만들수 있다
		//getter/setter 모두가 없으면 private이 된다 
		private String name;
		private int price;
		public Goods(String name,int price){
			this.name=name;
			this.price=price;
		}
		//public Goods(String name, int price) {
		//	this(name,price);
		//}
		public void setPrice(int price) {
			//	getter/setter를 활용하면 무결성 체크,
			//	인증 체크 같은 로직을 수행 가능 
			if (price < 0) {
				this.price = 0;
			} else {
				this.price = price;
			}
		}
		public void showinfo() {
			System.out.printf("상품 이름: %s%n가격: %,d%n",
					name, price);
			System.out.println();
			}
}
