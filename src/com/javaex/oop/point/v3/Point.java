package com.javaex.oop.point.v3;

public class Point {
	private int x;
	private int y;
	//v3. 메서드 오버로딩 
	//메서드 시그니처: 반환타입, 이름은 같고, 매개변수
	public Point(){
	}
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
	//메서드 오버로딩 
	//boolean draw true->그렸습니다,false->지웠습니다
	public void draw() {
		System.out.printf("점[X=%d,y=%d]",x,y);
		System.out.println();
		}
	public void draw(boolean bDraw) {
		String message= String.format("점[X=%d,y=%d]",
				x,y);
		message+=bDraw?"그렸습니다": "지웠습니다";
		System.out.println(message);
	}
}
