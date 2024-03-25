package com.javaex.oop.methods;

public class Point {
	private int x;
	private int y;
	
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
	public void draw() {
		System.out.printf("점[X=%d,y=%d]",x,y);
		System.out.println();
		}
}
