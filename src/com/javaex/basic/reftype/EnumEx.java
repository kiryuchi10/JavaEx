package com.javaex.basic.reftype;


public class EnumEx {
	//enum method test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String today;
		Week today=Week.Wednesday;
		System.out.printf(today,today.name(),today.ordinal());
				
		String strWeek = "FRIDAY";
	    Week obj = Week.valueOf(strWeek);
	    
	    System.out.printf("obj is %s(%d)%n",
	    obj.name(),
	    obj.ordinal());
	}

}
