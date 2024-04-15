package practice_miniproject;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    private String name;
    private String phoneNumber;
    private String companyNumber;
	private int index;
    public Customer(){
    }
    
    public Customer(int index,String name, String phoneNumber, String companyNumber) {
        this.index=index;
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
        return index + " " + name + " " + phoneNumber + "  " + companyNumber;
    }
}

// BookManagementSystem class to manage customers
public class BookManagementSystem {
    private static List<Customer> customers;

    public BookManagementSystem() {
        customers = new ArrayList<>();
    }

    // Read customer data from file
    public void readCustomerDataFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int count=0;
            while ((line = reader.readLine()) != null) {
            	count++;
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0];
                    String phoneNumber = parts[1];
                    String companyNumber = parts[2];
                    customers.add(new Customer(count,name, phoneNumber, companyNumber));
                }
            }
        }
    }

    // Add a customer to the list
    public void addCustomer(int index,String name, String phoneNumber, String companyNumber) {
        customers.add(new Customer(index,name, phoneNumber, companyNumber));
    }

    // Remove a customer from the list
    public void removeCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            customers.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
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

    // Display all customers with index
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManagementSystem system = new BookManagementSystem();
        
        String rootPath = System.getProperty("user.dir") + "\\files\\";
        String fileName = rootPath + "PhoneDB.txt";

        try {
            // Read customer data from file
            system.readCustomerDataFromFile(fileName);
        } catch (IOException e) {
            System.err.println("Error reading customer data from file: " + e.getMessage());
        }
			
		
      
        
			
		
        
        boolean exit = false;
        while (!exit) {
        	System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("------------------------------");
			System.out.print(">메뉴번호: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.displayCustomers();
                    break;
                case 2:
                    System.out.print(">이름: ");
                    String name2 = scanner.nextLine();
                    System.out.print(">전화번호: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("회사번호: ");
                    String companyNumber = scanner.nextLine();
                    int index=customers.size();
                    system.addCustomer(index+1,name2, phoneNumber, companyNumber);
                    break;
                case 3:
                    System.out.print("삭제번호: ");
                    index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    system.removeCustomer(index);
                    
                    break;
                case 4:
                    System.out.print("검색할 것: ");
                    String searchQuery = scanner.nextLine();
                    List<Customer> searchResults = system.searchCustomers(searchQuery);
                    if (searchResults.isEmpty()) {
                        System.out.println("비어있다");
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
                    System.out.println("다시 번호를 입력하시오");
            }
        }

        scanner.close();
    }
}