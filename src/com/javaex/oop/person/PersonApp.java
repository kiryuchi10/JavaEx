package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student p=new Student("정우성",45);
		Person s1=new Person("서울고등학교");
		Person s2=new Person("이정재",45,"한국고등학교");
		
		p.showinfo();
		s1.showinfo();
		s2.showinfo();
	}

}
