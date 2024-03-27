package com.javaex.oop.person;

public class Person extends Student {
	private String SchoolName;
	
	public Person(String SchoolName) {
		super(null,0);
		this.SchoolName=SchoolName;
	}
	public Person(String name,int age,String SchoolName) {
		super(name,age);
		this.SchoolName=SchoolName;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String SchoolName) {
		this.SchoolName=SchoolName;
	}
	public void showinfo() {
		System.out.printf("이름은:%s, 나이는 %d, 학교는 %s",
				super.getName(),super.getAge(),SchoolName);
		System.out.println();
	}
}
