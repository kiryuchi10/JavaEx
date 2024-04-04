package com.javaex.practice.example;

import java.util.Scanner;




public class Book {
    private int index;
    private String title;
    private String author;
    private int availability;

    public Book(int index, String title, String author) {
        this.index = index;
        this.title = title;
        this.author = author;
        this.availability = 1; // 1 represents available, 0 represents not available
    }

    public int getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    private static void displayBookInfo(Book[] books) {
        System.out.println("\nBook Information:");
        for (Book book : books) {
            String status = (book.getAvailability() == 0) ? "Not Available" : "Available";
            System.out.println("Index: " + book.getIndex() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Availability: " + status);
        }
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book(2, "뉴문", "스테파니메이어");
        books[2] = new Book(3, "이클립스", "스테파니메이어");
        books[3] = new Book(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book(5, "아리랑", "조정래");
        books[5] = new Book(6, "젊은그들", "김동인");
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book(8, "귀천", "천상병");
        books[8] = new Book(9, "태백산맥", "조정래");
        books[9] = new Book(10, "풀하우스", "원수연");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the book you want to pick:");
        int pickedIndex = scanner.nextInt();

        for (Book book : books) {
            if (book.getIndex() == pickedIndex) {
                book.setAvailability(0);
                System.out.println("You have picked the book: " + book.getTitle());
                break;
            }
        }

        displayBookInfo(books);
    }
}