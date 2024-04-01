package practice5;

public class Book {
	
	private int index;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(){
	}
	public Book(int index,String title
			, String author) {
		this.index=index;
		this.title=title;
		this.author=author;
		this.stateCode=1;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index=index;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getprint( ) {
		return stateCode;
	}
	public void setprint(int stateCode) {
		this.stateCode=stateCode;
	}
	
	@Override
	public String toString() {
		return String.format("index=%d, title=%s, author=%s, print=%d%n", index, title, author, stateCode);
	}

}