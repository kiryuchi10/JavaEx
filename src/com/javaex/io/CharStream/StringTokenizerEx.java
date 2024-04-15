package com.javaex.io.CharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String fileName = rootPath + "thieves.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원본:" +fileName);
		try(

				Reader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);)
				{
					String line;

					while ((line = br.readLine()) != null) {
						// 토크나이징
						StringTokenizer st = new StringTokenizer(line, " ");
						while (st.hasMoreTokens()) {
							String token = st.nextToken();
							System.out.println("Token:" + token);
						}
					}
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
}
