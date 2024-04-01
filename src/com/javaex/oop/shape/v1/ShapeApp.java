package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle s= new Circle(10,20,5);
		Rectangle t=new Rectangle(10,10,9,10);
		Circle c= new Circle(10,10,10);
		Rectangle r=new Rectangle(10,20,100,500);
		
		Point p= new Point(100,200);
		p.draw();
		// 추상 클래스의 직접 객체화 불가
		// 추상 클래스를 상속 받은 클래스는 직접 객체화 가능
		s.draw();
		t.draw();
		System.out.println(s);
		System.out.println(t);
		
		//Circle, Rectangle ->Shape의 서브클래스
		//Point-> Shape의 서브클래스가 아님(관계가 없다)
		//Circle, Rectangle, Point-> Drawable 공통된 인터페이스를 지니고 있다 
		Drawable objs[]=new Drawable[] {
				r,c,p
				};
		for(Drawable obj:objs) {
			if(obj instanceof Drawable) {
				//특정 인스턴스가 Drawable 인터페이스의 구현인가?
				obj.draw();
			}
		}
	}

}
