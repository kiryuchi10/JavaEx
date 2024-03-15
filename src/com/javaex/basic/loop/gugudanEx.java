package com.javaex.basic.loop;
import java.util.Scanner;
public class gugudanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		int Dan;
		Dan=sc.nextInt();
		int num;
		num=1;
	
		while(num<10)
		{
			int multi;
			multi=Dan*num;
			System.out.println(Dan+"*"+num+"="+(multi));
			num+=1;
		}
	
		sc.close();
	}

}
