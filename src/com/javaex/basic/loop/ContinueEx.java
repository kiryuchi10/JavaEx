package com.javaex.basic.loop;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=6;
		//int b=14;
		//int mcp;
		
		for(int i=1;i<=20;i++) {
			if (i%2==0 || i%3==0){
				continue;
			}
			else {
				System.out.println(i);
			}
	}

}
}