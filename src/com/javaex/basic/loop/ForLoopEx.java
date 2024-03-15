package com.javaex.basic.loop;
import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int dan;
		int num;
		int mult=0;
		dan=sc.nextInt();
		for(num=1;num<10;num++) {
			mult=dan*num;
			System.out.println(dan+" * "+num+"="+mult);
		}
		sc.close();
	}

}
