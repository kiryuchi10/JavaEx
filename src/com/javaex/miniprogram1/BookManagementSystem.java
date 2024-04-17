package com.javaex.miniprogram1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
	private String name;
	private String phoneNumber;
	private String companyNumber;
	private int index;

	public Customer() {
	}

	public Customer(int index, String name, String phoneNumber, String companyNumber) {
		this.index = index;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.companyNumber = companyNumber;
	}
	public void setIndex(int index) {
		this.index=index;
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
		return index + " " + name + " " + phoneNumber + "  " + companyNumber;
	}
}

public class BookManagementSystem {
	private static List<Customer> customers;

	public BookManagementSystem() {
		customers = new ArrayList<>();
	}

	public static void main(String[] args) {
		String rootPath = System.getProperty("user.dir") + "\\files\\";
		String fileName = rootPath + "PhoneDB.txt";
		BookManagementSystem system = new BookManagementSystem();

		String name;
		String num1;
		String num2;

		File file = new File(fileName);
		Scanner scanner = new Scanner(System.in);
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		String[] data = new String[3];
		try {

			String line;
			int count = 0;
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				data = line.split(",");
				name = data[0];
				num1 = data[1];
				num2 = data[2];
				count++;
				customers.add(new Customer(count, name, num1, num2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(customers);

		boolean exit = false;
		while (!exit) {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("------------------------------");
			System.out.print(">메뉴번호: ");
			Scanner sc=new Scanner(System.in);
			int choice;
			choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				system.displayCustomers();
				break;
			case 2:
				System.out.print(">이름: ");
				String name2 = sc.nextLine();
				System.out.print(">전화번호: ");
				String phoneNumber = sc.nextLine();
				System.out.print("회사번호: ");
				String companyNumber = sc.nextLine();
				int index = customers.size();
				system.addCustomer(index + 1, name2, phoneNumber, companyNumber);
				break;
			case 3:
				System.out.print("삭제번호: ");
				index = sc.nextInt();
				sc.nextLine(); // Consume newline
				system.removeCustomer(index - 1);

				break;
			case 4:
				System.out.print("검색할 것: ");
				String searchQuery = sc.nextLine();
				List<Customer> searchResults = system.searchCustomer(searchQuery);
				if (searchResults.isEmpty()) {
					System.out.println("비어있다");
				} else {
					System.out.println("\n탐색결과:");
					for (Customer customer : searchResults) {
						System.out.println(customer);
					}
				}
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("다시 번호를 입력하시오");
			}
		}

		scanner.close();
	}

	private List<Customer> searchCustomer(String searchQuery) {
		List<Customer> searchResults = new ArrayList<>();
		for (Customer customer : customers) {
			if (customer.getName().contains(searchQuery) || customer.getPhoneNumber().contains(searchQuery)
					|| customer.getCompanyNumber().contains(searchQuery)) {
				searchResults.add(customer);
			}

		}
		return searchResults;
	}

	private void removeCustomer(int i) {
		if (i < customers.size() && i >= 0) {
			customers.remove(i);
		} else {
			System.out.println("Invalid index.");
		}
		for (int i2 = 0; i2 < customers.size(); i2++) {
            customers.get(i2).setIndex(i2 + 1);
        }
	}

	public void addCustomer(int index, String name, String phoneNumber, String companyNumber) {
		customers.add(new Customer(index, name, phoneNumber, companyNumber));
	}

	public void displayCustomers() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
