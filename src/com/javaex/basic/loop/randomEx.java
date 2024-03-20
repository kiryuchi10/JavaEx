package com.javaex.basic.loop;

public class randomEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while_random();
		for_random();
	}
public static void while_random(){
	int count=0;
	while(true) {
		if(count<5) {
		int num=(int)(Math.random()*45)+1;
		System.out.print(num+" ");
		count++;
		}
		else
		{
			break;
		}
	}
	System.out.println();
}
public static void for_random(){
	for(int i=0;i<5;i++) {
		int num=(int)(Math.random()*45)+1;
		System.out.print(num+" ");
	}
}
}	

