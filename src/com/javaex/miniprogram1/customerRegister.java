package com.javaex.miniprogram1;

import java.util.Scanner;

public class customerRegister {
	int new_index;
	String new_name;
	String new_num1;
	String new_num2;
	
	Scanner sc=new Scanner(System.in);
	System.out.print(">이름: ");
	new_name=sc.next();
	System.out.print(">휴대전화: ");
	new_num1=sc.next();
	System.out.print(">회사전화: ");
	new_num2=sc.next();
	list.add(new customerList(new_index,new_name,new_num1,new_num2));
	
	public customerRegister() {
	}
	
	
	
	public int getNew_index() {
		return new_index;
	}



	public void setNew_index(int new_index) {
		this.new_index = new_index;
	}



	public String getNew_name() {
		return new_name;
	}



	public void setNew_name(String new_name) {
		this.new_name = new_name;
	}



	public String getNew_num1() {
		return new_num1;
	}



	public void setNew_num1(String new_num1) {
		this.new_num1 = new_num1;
	}



	public String getNew_num2() {
		return new_num2;
	}



	public void setNew_num2(String new_num2) {
		this.new_num2 = new_num2;
	}


	
	
	}
