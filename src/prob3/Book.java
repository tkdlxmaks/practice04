package prob3;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// method
	public void rent() {
		System.out.println(getTitle() + "이 대여되었습니다.");
		setStateCode(0);
	}

	public void print() {
		/* 책 제목:트와일라잇, 작가:스테파니메이어, 대여 유무:재고있음 */
		if (getStateCode() == 0) {
			System.out.println("책 제목:" + getTitle() + " 작가:" + getAuthor() + " 대여 유무: 대여중");
		} else {
			System.out.println("책 제목:" + getTitle() + " 작가:" + getAuthor() + " 대여 유무: 재고있음");
		}
	}

	// getter & setter
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

}
