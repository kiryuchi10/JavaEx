package com.javaex;

public class Person {
	private String name;
	private String hp;
	public Person() {
		System.out.println("생성자 Person(0) 호출");
	}
	public Person(String name, String hp)
	{
		this.name=name;
		this.hp=hp;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String gethp() {
		return hp;
	}
	public void sethp(String hp) {
		this.hp=hp;
	}
	public void showInfor() {
		System.out.println("#이름"+name+"#hp"+hp);
	}
	
}
