package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert input to lowercase for easier comparison
        
        switch(inputString) {
        	case "a":
        	case "e":
        	case "i":
        	case "o":
        	case "u":
        		System.out.println("모음입니다");
        		break;
        	default:
        		System.out.println("자음입니다");
        }
        
       
    }
}