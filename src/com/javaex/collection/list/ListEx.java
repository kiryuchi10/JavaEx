package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// 	객체가 아니고 인터페이스
		List lst=new List();
		
		List<String> lst = new LinkedList<>();
		
		// 객체 추가 : add, 맨 마지막에 노트 연결
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		System.out.println("lst="+lst);
		//순서가 있다. 중복허용. 
		//객체 삽입
		lst.add(2,"c#");
		System.out.println("lst="+lst);
		//리스트는 중복삽입을 허용
		lst.add("Java");
		System.out.println("lst="+lst);
		lst.add("Java");
		System.out.println("lst="+lst);
		
		System.out.println("size="+lst.size());
		
		System.out.println("lst="+lst)
		
		lst.clear(); 
		System.out.println("lst="+lst);
		//삿제 리;

	}

}
