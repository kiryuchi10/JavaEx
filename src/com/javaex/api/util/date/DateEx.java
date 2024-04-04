package com.javaex.api.util.date;

import java.text.DateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간 데이터를 표현하는 객체
		// 날짜 관련 기능은 Calendar 객체
		Date now = new Date();
		System.out.println("현재 시간:"+now);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL:"+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG:"+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM:"+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT:"+df.format(now));
	}

}
