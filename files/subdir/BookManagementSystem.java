package com.javaex.miniprogram1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    private String index;
	private String name;
    private String phoneNumber;
    private String companyNumber;

    public Customer(int count,String name, String phoneNumber, String companyNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.companyNumber = companyNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    @Override
    public String toString() {
    	return index +". "+ name +" "+phoneNumber +" "+companyNumber;
    }
}

// BookManagementSystem class to manage customers
public class BookManagementSystem {
	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String fileName = rootPath + "PhoneDB.txt";
	
    private List<Customer> customers;

    public BookManagementSystem() {
        customers = new ArrayList<>();
    }

    // Add a customer to the list
    public void addCustomer(int index,String name, String phoneNumber, String companyNumber) {
        customers.add(new Customer(index, name, phoneNumber, companyNumber));
    }

    // Remove a customer from the list
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    // Search for customers based on a string contained in their data
    public List<Customer> searchCustomers(String searchQuery) {
        List<Customer> searchResults = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(searchQuery) ||
                customer.getPhoneNumber().contains(searchQuery) ||
                customer.getCompanyNumber().contains(searchQuery)) {
                searchResults.add(customer);
            }
        }
        return searchResults;
    }

    // Display all customers
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    
 
	public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem();
        String name;
		String phoneNumber;
		String companyNumber;
		String totalDB;
		
		Scanner scanner=new Scanner(System.in);
		String[] arr = new String[3];
		File file= new File(fileName);
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<customerList> list = new ArrayList<>();
		int count=1;
		while (scanner.hasNextLine()) {// 더 읽을 라인이 있는지 확인
			totalDB = scanner.nextLine(); // 문자열 토큰 읽기
			arr = totalDB.split(",");
			name = arr[0];
			phoneNumber = arr[1];
			companyNumber = arr[2];
			list.add(new customerList(count,name,phoneNumber,companyNumber));
			//System.out.printf("%s %s %s", name, phonen1, phonen2);
			//System.out.println();
			count++;
		}
        boolean exit = false;
        while (!exit) {
            System.out.println("\nActions:");
            System.out.println("1. Show all customers");
            System.out.println("2. Add a new customer");
            System.out.println("3. Remove a customer");
            System.out.println("4. Search for a customer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nAll Customers:");
                    system.displayCustomers();
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    phoneNumber = scanner.nextLine();
                    System.out.print("Enter company number: ");
                    companyNumber = scanner.nextLine();
                    system.addCustomer(count, name, phoneNumber, companyNumber);
                    System.out.println("Customer added successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of customer to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (index >= 0 && index < system.customers.size()) {
                        Customer customerToRemove = system.customers.get(index);
                        system.removeCustomer(customerToRemove);
                        System.out.println("Customer removed successfully.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter search query: ");
                    String searchQuery = scanner.nextLine();
                    List<Customer> searchResults = system.searchCustomers(searchQuery);
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching customers found.");
                    } else {
                        System.out.println("\nSearch Results:");
                        for (Customer customer : searchResults) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
        
 }
