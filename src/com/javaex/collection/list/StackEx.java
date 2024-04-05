package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<>();
		for (int i=0;i<10;i++) {
			stack.push(i);
			System.out.println("STACK:"+stack);

		}
		//	가장 마지막에 있는 데이터 확인
		System.out.println("PEEK"+stack.peek());
		System.out.println("Stack :" +stack);
		
		// 인출
		System.out.println("POP:"+stack.pop());
		System.out.println("STACK:"+stack);
		
//		while(true){
//			System.out.println("POP:"+stack.pop());
//			System.out.println("STACK:"+stack);
		 // Stack 비어있는지 확인 해야 한다
		while(!stack.empty()) {
			System.out.println("POP"+stack.pop());
			System.out.println("STACK"+stack);
		}
		
		
		
		
	}

}
