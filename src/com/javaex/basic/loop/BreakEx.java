package com.javaex.basic.loop;
import java.util.Scanner;

public class BreakEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count;
		count=1;
		int num;
		num=1;
//		System.out.println("숫자를 입력하세요");
//		num=sc.nextInt();
		
		
		while(true) {
			if(num%6==0 && num%14==0)
			{
				break;
			}
			else {
				num++;
			}
			
		}
		System.out.println(num);
		sc.close();
	}

}
