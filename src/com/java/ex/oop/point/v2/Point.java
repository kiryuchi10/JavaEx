package com.java.ex.oop.point.v2;

//v2.생성자
//기본 생성자와 전체 필드 생성자

public class Point {
	private int x;
	private int y;

public Point(int x, int y){
		this.x=x;
		this.y=y;
	}
/*	
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x=x;
	}
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y=y;
	}
*/
	public void draw() {
		System.out.printf("점[X=%d,y=%d]",x,y);
		System.out.println();
		}
}
