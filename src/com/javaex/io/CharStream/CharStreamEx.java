package com.javaex.io.CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "char.txt";

	public static void main(String[] args) {
		// FileWriter
		writeFile();
		// FileReader
		readFile();

	}

	private static void writeFile() {
		// FileWriter를 이용해서 text 파일 생성
		System.out.println("파일명:"+ filename);
		
		// 스트림을 열고
		try(
			Writer writer = new FileWriter(filename)){
			writer.write("하이미디어 아카데미\r\n");
			writer.write("Java Programming \r\n");
			writer.write("2024.04");
			writer.flush();
			//writer.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	// 텍스트 기록
	}
	private static void readFile() {
		System.out.println("파일명:"+ filename);
		String message="";
		try(
			Reader reader= new FileReader(filename);)
		{
			// 읽어들일 데이터 저장 변수 
			int data=0;
			while((data=reader.read())!=-1) {
				System.out.println("읽은 데이터:"+(char)data);
				message+=(char)data;
			}	
			}catch(FileNotFoundException e) {
				System.err.println("파일을 찾을 수 없습니다.");
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
}
