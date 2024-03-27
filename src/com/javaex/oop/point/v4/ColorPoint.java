package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	//기본 생성자가 없으면 기본생성자를 추가해서 compile
	private String color;
	
	public ColorPoint(String color) {
		//생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본생성자 호출
		super(0,0);
		this.color=color;
	}
	public ColorPoint(int x,int y,String color) 
	{
		super(x,y);//부모생성자 호출
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	@Override
	public void draw() {
		//System.out.printf("색깔점[%d,%d,color=%s] 점을 찍었습니다.%n,"
		//		,super.getx(),super.gety(),color);
		System.out.printf("색깔점[%d,%d,color=%s] 점을 찍었습니다.%n"
				,super.getx(),super.gety(),color);	
	}
	
}
