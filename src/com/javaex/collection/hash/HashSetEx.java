package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
class student{
	
	int id;
	String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// 해시 함수의 로직 : 학번을 기준으로 
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof student) {
			student other=(student) obj;
			return id==other.id &&
					name.equals(other.name);
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
}

public class HashSetEx {
	public static void main(String[] args) {
		// 1. HashSet 사용법 (기본타입)
		usingHashSet();
		// 2. 집합 연산
		setOperation();
		// 3. HashSet 사용법 (객체 자료형)
		usingHashSetwithCustom();
		
	}
	private static void usingHashSet() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		// 요소(객체) 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		System.out.println("hs:"+hs);
		System.out.println("size:"+hs.size());
		
		
		// 특정 객체 포함 여부 
		System.out.println("C++ 포함?"+hs.contains("C++"));
		System.out.println("Linux 포함?"+hs.contains("Linux"));
		
		System.out.println("hs:"+hs);
		
		
		// 순서가 없음 : 객체로 삭제 하는 방법만 제공
		// 객체 삭제
		hs.remove("C++");
		System.out.println("hs:"+hs);
		
	}
	private static void setOperation() {
		HashSet<Integer> numbers=
				new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println("전체집합:"+numbers);
		HashSet<Integer> odds=
				new HashSet<>(Arrays.asList(1,3,5,7,9));
		HashSet<Integer> evens=
				new HashSet<>(Arrays.asList(2,4,6,8,10));
		System.out.println("홀수집합:"+odds);
		System.out.println("짝수집합:"+evens);
		HashSet<Integer> mThree=
				new HashSet<>(Arrays.asList(3,6,9));
		System.out.println("3의배수집합:"+mThree);
		
		// 교집합 :retainAll
		// 원본 보호를 위해 복제해서 사용 
		System.out.println("=============교집합");
		HashSet<Integer>setA=(HashSet<Integer>)odds.clone();
		HashSet<Integer>setB=(HashSet<Integer>)mThree.clone();
		System.out.println("집합A"+setA);
		System.out.println("집합B"+setB);
		
		setA.retainAll(setB); //집합A교집합B ={3,9}
		System.out.println("교집합:"+setA);
		System.out.println(setA.equals(
				new HashSet<Integer>(Arrays.asList(3,9))));
		//합집합 : addAll
		System.out.println("===============합집합");
		setA=(HashSet<Integer>)odds.clone();
		setB=(HashSet<Integer>)evens.clone();
		System.out.println("집합A"+setA);
		System.out.println("집합B"+setB);
		setA.addAll(setB);
		System.out.println("합집합"+setA);
		//차집합 : removeAll
		setA=(HashSet<Integer>)odds.clone();
		setB=(HashSet<Integer>)evens.clone();
		System.out.println("집합A"+setA);
		System.out.println("집합B"+setB);
		setA.removeAll(setB);
		System.out.println("차집합"+setA);
	}
	private static void usingHashSetwithCustom() {
		HashSet<student> hs = new HashSet<>();
		student s1 = new student(10,"홍길동");
		student s2 = new student(20,"홍길동");
		student s3 = new student(30,"고길동");
		student s4 = new student(30,"고길동");
		
		// 이름도 같고 학번도 같기 때문에
		// -> 두 객체를 동등 객체로 판정하는 로직을 만들어야한다. 
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		System.out.println("학생부"+hs);
	}
}
