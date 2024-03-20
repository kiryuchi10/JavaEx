package com.javaex.practice;

public class P4_ex6 {
	public static void main(String[] args) {
		char c[] = 
			{'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			if (c[i]==' '){
				c[i]=',';	
		}
			System.out.print(c[i]);
		}
	}
}
