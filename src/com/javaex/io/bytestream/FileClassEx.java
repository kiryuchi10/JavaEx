package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	// files의 경로 위치
	// 
	private static String rootPath= System.getProperty("user.dir")+"\\files";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("루트 경로:"+rootPath);
		
		File f = new File(rootPath);
		System.out.println(rootPath+":"+(f.exists()?"존재":"없음"));
		
		
		
		File newDir= new File(rootPath+"\\subdir\\subdir2");
		if(!newDir.exists()) {
			if(newDir.mkdirs()) {//실제 생성 
				System.out.println(newDir + "을 생성했습니다");
			}
		}
		// 새로 생성한 files\\subdir 디렉터리에 새파일 myfile.txt를 만들어 봅시다. 
		File newFile =new File(rootPath+"\\subdir\\myfile.txt");
		if(!newFile.exists()) {
			try {
				newFile.createNewFile();
			}catch(IOException e) {
				System.err.println("파일을 못만들었어요");
			}
		}
		printFileInfo(f);
		newFile.delete();
	}
	private static void printFileInfo(File f) {
		System.out.println("============");
		//전달 받은 파일 객체가 디렉터리인가?
		if (f.isDirectory()) {
			File[] files=f.listFiles();
			for(File file:files) {
				System.out.print(file.isDirectory()? "d" :"f");
				System.out.print(file.canRead()? "r":".");
				System.out.print(file.canWrite()? "w":".");
				System.out.print(file.canExecute()? "x":".");
				System.out.print(file.length());
				System.out.println(" "+ file.getName());
				System.out.print(f.getName()+"\t");
				
			}
		}
		else {// 파일 -> 간략 정보 
			System.out.println("File:");
			//간략한 파일 정보
			System.out.print(f.getName()+"\t");//파일명
			System.out.println(f.canRead()? "r" : "."); //읽을 수 있는 파일인가?
			System.out.print(f.canWrite()? "w" : "."); //쓸 수 있는 파일인가?
			System.out.print(f.canExecute()? "x" : "."); //실행 가능 파일?
			System.out.println();
		}
	}
}
