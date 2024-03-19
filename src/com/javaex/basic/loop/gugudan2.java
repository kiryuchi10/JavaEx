package com.javaex.basic.loop;
import java.util.Scanner;
public class gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.println("단을 입력해주세요");
		//int Dan;
		//Dan=sc.nextInt();
		int product;
		product=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				product=i*j;
				System.out.println(i+"*"+j+"="+product);
			}
		}
	
		//sc.close();
	}

}
