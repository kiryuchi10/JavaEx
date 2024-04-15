package com.javaex.io.CharStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String fileName = rootPath + "thieves.txt";

	public static void main(String[] args) {
		// 입력 소스(파일)
		File file= new File(fileName);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		String name;
		float height;
		float weight;
		
		while(scanner.hasNextLine()) {// 더 읽을 라인이 있는지 확인 
			name=scanner.next(); //문자열 토큰 읽기
			height = scanner.nextFloat();
			weight = scanner.nextFloat();
			
			System.out.printf("%s, %f,%f",name,height,weight);
		}
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}
		scanner.close();
		
		// 데이터 저장 변수 
	}

}
