package com.javaex.api.objectclass.ex1;

//	모든 객체의 최상의 객체는 Object
//	Object 클래스는 개체가 객체로서 기능을 수행하기 위한 기본적인 기능을 수행하기 위한 기본적인 기능들을 구현

public class Point { // extends java.lang.object
	private int x;
	private int y;

	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		}
	@Override
	public String toString() {
		//System.out.println("x: %d,y: %d",x,y);
		return "x: "+x+"y:"+y;
	}
}
