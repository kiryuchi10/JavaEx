package com.javaex.oop.methods;

public class PointApp {
	public static void main (String[] args) {
		Point point1=new Point();
		point1.setx(5);
		point1.sety(5);
		Point point2=new Point();
		point2.setx(10);
		point2.sety(23);
		
		point1.draw();
		point2.draw();
		
	}
}
