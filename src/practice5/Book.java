package practice5;

public class Book {
	
	private static int index;
	private static String title;
	private static String author;
	private static int stateCode;

	public Book(int index,String title
			, String author) {
		this.index=index;
		this.title=title;
		this.author=author;
		this.stateCode=stateCode;
	}
	static int getIndex() {
		return index;
	}
	static String getTitle() {
		return title;
	}
	static String getAuthor() {
		return author;
	}
	static int getRent() {
		return stateCode;
	}
	public int setRent(int stateCode) {
		return this.stateCode=stateCode;
	}
}
