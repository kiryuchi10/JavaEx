package com.javaex.practice;
import java.util.Scanner;

public class P4_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] numArray=new int[6];
		int num;
		for(int i=0;i<numArray.length;i++)
		{
			num=(int)(Math.random()*45)+1;
			for (int j=0;j<numArray.length;j++)
			{
				if(i>1 &numArray[i]==numArray[j])
				{
					continue;
				}
				else
				{
					numArray[i]=num;
				}
			}
		}
		
		for(int j=0;j<numArray.length;j++) {
			System.out.print(numArray[j]+"\t");	
		}
		sc.close();
	}
}
