package com.javaex.oop.point.v3;

public class PointApp {
	public static void main (String[] args) {
		Point point1=new Point();
		point1.setx(5);
		point1.sety(5);
		Point point2=new Point();
		point2.setx(10);
		point2.sety(23);
		
		point1.draw(true);
		point2.draw(false);
		
	}
}
