package com.javaex.oop.shape.v1;


// 그림판에서 그려져야 하지만
// 면적을 가진 도형은 아니다
public class Point implements Drawable{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void draw() {
		System.out.printf("점[x=%d,y=%d]을 그렸습니다.%n",
				x,y);
	}
}
