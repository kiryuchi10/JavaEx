package com.javaex.basic.loop;
import java.util.Scanner;

public class DoWhilEx {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요. [0이면 종료] ");
		int val;
		int total;
		total=0;
		do{
		
			val=sc.nextInt();
			total+=val;
			System.out.println("합계"+total);
			
			
		}while(val!=0);
		sc.close();
}
}