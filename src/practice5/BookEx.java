package practice5;

import java.util.Scanner;

public class BookEx {
    private int index;
    private String title;
    private String author;
    private int availability;

    public BookEx(int index, String title, String author, int availability) {
        this.index = index;
        this.title = title;
        this.author = author;
        this.availability = availability;
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
        Book[] books = {
            new Book(1, "To Kill a Mockingbird", "Harper Lee", 1),
            new Book(2, "1984", "George Orwell", 1),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 1)
        };

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
