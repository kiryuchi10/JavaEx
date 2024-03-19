package com.javaex.practice;
import java.util.Scanner;

public class Practice2_Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert input to lowercase for easier comparison
        
        
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                	System.out.println("모음입니다");
                } else {
                	System.out.println("자음입니다");
                }
            }
        }
        
       
    }
}