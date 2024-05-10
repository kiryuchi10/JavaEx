package practice_miniproject;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
		listBookDBs();
		System.out.println();

//		insertBookDB();
		updateBookDB();
//		getBookDB();
//		deleteBookDB();

		System.out.println();

		listBookDBs();
	}

	private static void deleteBookDB() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("삭제할 이름:");
		String name = scanner.nextLine();

		BookDBDAO dao = new BookDAOImplOracle();
		boolean success = dao.delete(name);

		System.out.println("phoneDB DELETE " + (success ? "성공" : "실패"));

		scanner.close();
	}

	private static void getBookDB() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("찾을 이름:");
		String name = scanner.nextLine();
		scanner.nextLine();

		BookDBDAO dao = new BookDAOImplOracle();
		BookVO vo = dao.get(name);

		if (vo != null) {
			System.out.printf("%s\t%s\t%s%n", vo.getName(), vo.getPhoneNumber(), vo.getHomeNumber());
		} else {
			System.out.println("레코드를 찾지 못했습니다.");
		}

		scanner.close();
	}

	private static void updateBookDB() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("변경할 이름:");
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.print("휴대폰 번호:");
		String phoneNumber = scanner.nextLine();
		System.out.print("집 번호:");
		String homeNumber = scanner.nextLine();

		BookVO vo = new BookVO(name, phoneNumber, homeNumber);

		BookDBDAO dao = new BookDAOImplOracle();
		boolean success = dao.update(vo);

		System.out.println("phoneDB UPDATE " + (success ? "성공" : "실패"));
		scanner.close();
	}

	private static void insertBookDB() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름:");
		String name = scanner.nextLine();

		System.out.print("휴대폰 번호:");
		String phoneNumber = scanner.nextLine();
		
		System.out.print("집 번호:");
		String homeNumber = scanner.nextLine();

		BookVO vo = new BookVO(name, phoneNumber,homeNumber);

		BookDBDAO dao = new BookDAOImplOracle();
		boolean success = dao.insert(vo);

		System.out.println("phoneDB INSERT " + (success ? "성공" : "실패"));

		scanner.close();

	}

	private static void listBookDBs() {
		BookDBDAO dao = new BookDAOImplOracle();
		System.out.println("========== phoneDBs ==========");

		List<BookVO> list = dao.getList();
		if (list.size() > 0) {
			// Iterator 순회
			Iterator<BookVO> it = list.iterator();
			
			while (it.hasNext()) {
				BookVO vo = it.next();
				System.out.printf("%s\t%s\t%s%n", vo.getName(), vo.getPhoneNumber(), vo.getHomeNumber());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}

}