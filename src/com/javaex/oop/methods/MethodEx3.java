package com.javaex.oop.methods;

public class MethodEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHelloMethod();
		printNumbers();
		System.out.println();
		System.out.println(getRandomNumber());
		System.out.println(getSum());
		int num=(int)(Math.random()*100)+0;
		printOddorEven(num);
		System.out.println(getLargeNumber(5,6));
		System.out.println(concatenateStrings("Hello","Java"));
		System.out.println(sumAll(1,2,3));
		System.out.println(concantenateStrings("A"," ","Bitch"));
	}
	public static String concantenateStrings(String ... words) {
		String total="";
		for (String words1 :words) {
			total+=words1;
		}
		return total;
	}
	public static int sumAll(int ... values) {
		int total=0;
		for(int vars:values)
		{
			total+=vars;
		}
		return total;
	}
	public static String concatenateStrings(String word1, String word2) {
		String sum=word1+word2;
		return sum;
	}
	public static void printOddorEven(int num) {
		if (num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static int getLargeNumber(int num1,int num2) {
		if (num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static int getSum() {
		int num []= {1,2,3,4,5,6,7,8,9,10};
		int total=0;
		for (int vals:num) {
			total+=vals;
		}
		return total;
	}
	public static int getRandomNumber() {
		int getRandomNum=(int)(Math.random()*100)+0;
		return getRandomNum;
	}
	public static void printHelloMethod() {
		System.out.println("Hello Method!");
	}
	public static void printNumbers() {
		double nums[]= {1,2,3,4,5,6,7,8,9,10};
		for (double vals :nums) {
			System.out.print(vals+" ");
		}
	}
}
