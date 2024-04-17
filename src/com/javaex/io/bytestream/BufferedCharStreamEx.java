package com.javaex.io.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "last-leaf-filtered.txt";

	public static void main(String[] args) {
		// source에서 leaf or leaves가 포함된 문장만 필터링해서
		// target에 저장
		System.out.println("원본파일:" + source);
		System.out.println("필터파일:" + target);

		try (Reader fr = new FileReader(source);
				Writer fw = new FileWriter(target);
				// 주스트림 연결
				// 보조 스트림 연결
				// 라인단위 문자열 작업 -> Buffer 기능 사용
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);)
		{
			String line;// = "";
			while((line=br.readLine())!=null) {
				//System.out.println(line);
				if(line.toLowerCase().contains("leaf")||
				   line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					// 필터링된 라인만 별도 저장
					bw.write(line);
					bw.newLine();
				}
				
			}
			System.out.println("필터링 완료");
		}catch(FileNotFoundException e){
			System.err.println("파일을 찾을 수 업습니다");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
