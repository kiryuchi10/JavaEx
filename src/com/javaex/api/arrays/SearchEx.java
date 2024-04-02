package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		//  1. 기본 타입 검색
		//기본타입 검색
		basicSearch();
		//	2. 사용자 정의 객체의 검색

	}
	private static void basicSearch() {
		// Java Arrays의 검색기능은 binarySearch 방식으로 구현
		int [] nums= {6,4,3,5,7,8,2,1,9,10};
		Arrays.sort(nums);
		int index=Arrays.binarySearch(nums, 8);
		System.out.println("정렬된 배열"+Arrays.toString(nums));
		System.out.println("8의 인덱스: "+index);//이진검색 방식의 배열은 정렬이 되어있어야한다
		
		//	참조 타입의 검색
		String[] data= {"Java","C","C++","Python","Linux"};
		Arrays.sort(data);
		System.out.println("정렬된 배열:"+Arrays.toString(data));
		index=Arrays.binarySearch(data, "Java");
		System.out.println("Java의 인덱스:"+ index);
		
	}

}
