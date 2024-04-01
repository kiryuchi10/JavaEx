package com.javaex.oop.shape.v1;

public class Circle extends Shape implements Drawable {
	private double radius;
	
	//생성자
	public Circle(int x, int y, double radius) {
		//부모 생성자 호출
		super(x, y);
		this.radius=radius;
	}
	@Override
	public void draw() {
		System.out.printf("원[x=%d,y=%d,r=%f area=%f]을 그렸어요.%n", 
				x,y,radius,area());
		
	}
	@Override 
	public double area() {
		double area=Math.PI*Math.pow(radius, 2);// radius*radius
		return 0;
	}
}
