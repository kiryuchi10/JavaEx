package com.javaex.oop.point.v4;

public class PointApp {
	public static void main (String[] args) {
		Point point1=new Point(5,5);
		//point1.setx(5);
		//point1.sety(5);
		Point point2=new Point(10,20);
		//point2.setx(10);
		//point2.sety(23);
		
		point1.draw(true);
		point2.draw(false);
		
		ColorPoint cp1= new ColorPoint("red");
		cp1.draw();
		ColorPoint cp2= new ColorPoint(10,10,"blue");
		cp2.draw();
		
	}
}
