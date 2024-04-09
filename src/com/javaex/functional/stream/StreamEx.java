package com.javaex.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAverage() {
		return getTotal() / (double)3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", getTotal()="
				+ getTotal() + ", getAverage()=" + getAverage() + "]";
	}

}

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = { 80, 90, 100, 60, 50 };

		IntStream arrStream = Arrays.stream(scores);
		// System.out.println(arrStream);

		// 사용자 정의 클래스 타입 스트림
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 90, 95, 100));
		students.add(new Student("고길동", 80, 50, 90));
		students.add(new Student("전우치", 80, 90, 80));
		students.add(new Student("임꺽정", 70, 65, 70));
		students.add(new Student("장길산", 60, 60, 60));

		// 컬레션 프레임워크 클래스에서는 .stream() 메서드로 스트림 추출 가능
		Stream<Student> objStream = students.stream();
		// System.out.println(objStream);

		// 최종 연산: forEach
		//testForEach(scores, students);
		//testFilter(scores,students); ///필터함수
		//testMap(scores);
		//testCountSum(scores);
		//testFilterSort(students);
		testReduce(scores);
	}

	private static void testForEach(int[] source, List<Student> lst) {
		// forEach->최종연산, 스트림을 순회하면서 최종 처리
		System.out.println("================ Stream forEach");
		for (int i = 0; i < source.length; i++) {
			System.out.print(source[i] + " ");
		}
		System.out.println();

		Arrays.stream(source).forEach((n -> System.out.print(n + " ")));

		// 컬랙션 순회
		Iterator<Student> it = lst.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
		System.out.println();
		
		// forEach
		lst.stream().forEach(obj -> System.out.println(obj));
	}
	private static void testFilter(int[] arr,List<Student> lst) {
		//array에서 점수가 70점 이상인 것만 추출
		System.out.println("==============Stream filter");
		System.out.println(Arrays.toString(arr));
		
		Arrays.stream(arr)
			.filter(n->n>=70)
			.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// lst에서 평균점수가 70점 이상인 것만 추출해보자
		lst.stream()	
			.filter(obj->obj.getAverage()>=70)
			.forEach(System.out::println);
	}
	private static void testMap(int [] arr) {
		System.out.println("==============Stream map");
		// 맵은 형태 그대로 내부 요소의 변형
		System.out.println("원본:"+Arrays.toString(arr));
		// 각 요소를 /2 해서 새로운 배열을 생성
		
		Arrays.stream(arr)
			.map(n->n/2)
			.forEach(n->System.out.println(n+ " "));
		System.out.println();
		
		// 배열 arr 요소 모두 *2 해서 -> 새로운 배열로 변환
		int [] multiply=Arrays.stream(arr).map(n->2*n).toArray();
		System.out.println("*2:"+Arrays.toString(multiply));
		//Arrays.stream(multiply).forEach(n->System.out.println());
		
	}
	private static void testCountSum(int [] arr) {
		//count : 요소의 개수를 카운트하는 함수 (집계)
		int numCount=(int)Arrays.stream(arr).count();
		System.out.println(Arrays.toString(arr)+":count="+numCount);
		//sum : 기본형 특화 스트림에서만 사용가능
		// 기본형 특화 스트림 : primitive type을 처리하기 위해서 만들어진 스트림
		//IntStream, LongStream, DoubleStream
		//배열로부터 70점 이상인 점수를 필터링 모두 합산
		System.out.println("70점 이상 점수 합계:"+Arrays.stream(arr)
			.filter(n->n>=70)
			.sum());
	}
	private static void testFilterSort(List<Student> lst) {
		//학생 목록으로부터 평균점이 70점 이상인 학생 목록으로부터 학생 이름의 오름차순으로 정렬하여 출력
		// 이름순 정렬 
		System.out.println("==========Stream filter + sort");
		lst.stream()
			.filter(obj->obj.getAverage()>=70)
			.sorted((obj1,obj2)->
			//obj1.getName().compareTo(obj2.getName()))//정렬기준 (오름차순)
			-obj1.getName().compareTo(obj2.getName()))//정렬기준 (내림차순)
			.forEach(System.out::println);
	}
	private static void testReduce(int [] arr) {
		System.out.println("원본:"+Arrays.toString(arr));
		System.out.println("=================stream reduce");
		int total=Arrays.stream(arr)
					.reduce(0, 
							(acc,curr)->{
						System.out.println("acc:"+acc);
						System.out.println("Curr:" +curr);
						return acc+curr;
					});
		System.out.println("Total:"+total);
		
					
		
	}
}
