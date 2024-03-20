package com.javaex.practice;
import java.util.Scanner;

public class P4_ex5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data=new int[5];
		double sum=0;
		for(int i=0;i<5;i++) {
			Scanner sc=new Scanner(System.in);
			data[i]=sc.nextInt();
//			System.out.println(data[i]);
			for(int j=0;j<data.length;j++) {
				sum+=data[i];
			}
		}
		double average;
		average=sum/data.length;
		System.out.printf("길이는: %d",data.length);
		System.out.println("평균은 "+average+"입니다");
	}

}
