package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {

		
		
		
		
				// 입력소스
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 출력타겟
		byte[] outSrc = null;

		System.out.println("입력소스:" + Arrays.toString(inSrc));
		/*
		InputStream bis = null;
		OutputStream bos=null;
		// 입력 스트림과 출력 스트림 열기
		bis = new ByteArrayInputStream(inSrc); // 추상 상속..
		bos = new ByteArrayOutputStream();
		
		int data = 0; // 입력 스트림으로부터 넘어올 데이터 저장 변수 
		
//		while((data=bis.read())!=-1) {
//			System.out.println("Read data:" + data); 
//			bos.write(data);
//		}
		
			// try - with - resource 
		  try { while((data=bis.read())!=-1) { // -1이면 더이상 읽을 데이터가 없음
		  System.out.println("Read data:" + data); 
		  bos.write(data);
		  
		  } } catch (IOException e) { // IOException 처리 
		  e.printStackTrace(); }
		  catch(Exception e){
			  e.printStackTrace();
		  }finally {
			  try{bis.close();
			  bos.close();
			  }catch(Exception e) {
			  }
		  }
		 
		outSrc=((ByteArrayOutputStream)bos).toByteArray();
		System.out.println("최종 결과:"+ Arrays.toString(outSrc));
		
		
*/
		
		//AutoCloseable을 활요한 예외 처리 : try - with - resources
		try (InputStream bis = new ByteArrayInputStream(inSrc);
				OutputStream bos =new ByteArrayOutputStream()){
			int data = 0;
			
			while((data=bis.read())!=-1) {
				System.out.println("Read data:" + data);
				bos.write(data);
			}
			outSrc=((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("최종 결과:"+ Arrays.toString(outSrc));
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
