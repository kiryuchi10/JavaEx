package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

class Member implements Comparable{
	@Override
	public int compareTo(Object o) {
		// 두 객체의 선후 관계를 비교해서 
		// 두객체의 순서가 같으면 0
		// 앞의 객체가 빠르면 -1, 
		return 0;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	String name;
	
	public Member(String name) {
		this.name=name;
	}
}
public class SortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicSort();
		basicDescSort();
		customClassSort();
		customClassSearch();
		
	}
	private static void basicSort() {
		int[]scores= {80,50,30,90,75,88,77};
		System.out.println("배열원본:"+Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("오름차순:"+Arrays.toString(scores));
	}
	private static void basicDescSort() {
		Integer[]scores= {80,50,30,90,75,88,77};
		System.out.println("배열원본:"+Arrays.toString(scores));
		//내림차순
		Arrays.sort(scores,
				Collections.reverseOrder());
		System.out.println("내림차순:"+Arrays.toString(scores));
	}
	private static void customClassSort() {
		Member[] members= { 
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정"),
				new Member("장길산")};
		
		System.out.println("배열원본:"+Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("오름차순:"+Arrays.toString(members));
		}
	private static void customClassSearch() {
		Member[] members= { 
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정"),
				new Member("장길산")};
		
		System.out.println("배열원본:"+Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("오름차순:"+Arrays.toString(members));
		
		}
	}

