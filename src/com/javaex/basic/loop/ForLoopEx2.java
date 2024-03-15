package com.javaex.basic.loop;
import java.util.Scanner;

public class ForLoopEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("단수 입력");
		int star_num;
		star_num=sc.nextInt();
		for(int num=0;num<star_num;num++) {
			 for (int k = 0; k < num + 1; k++) {
	                System.out.print("*");
	            }
			 System.out.println();
		}
		sc.close();
	}

}
