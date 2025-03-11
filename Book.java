package classAndObjects;

class BookDetails {
	private String bookName;
	private String authorName;
	private double cost;
	private int totalPages;
	private int yearOfPublish;
	static int totalBooks;
	
	BookDetails(String bookName,String authorName,double cost,int totalPages,int yearOfPublish){
		this.bookName=bookName;
		this.authorName=authorName;
		this.cost=cost;
		this.totalPages=totalPages;
		this.yearOfPublish=yearOfPublish;
		totalBooks++;
	}
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public static int getTotalBooks() {
		return totalBooks;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	
}
public class Book{
	public static void main(String [] args) {
		BookDetails b1=new BookDetails("The Book Thief","Markus Zusak",700,2005,584);
		System.out.println(b1.getBookName());
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getCost());
		System.out.println(b1.getTotalPages());
		System.out.println(b1.getYearOfPublish());
		System.out.println(BookDetails.getTotalBooks());
		
		b1.setBookName("LIFE OF MUGI");
		b1.setAuthorName("Mugesh");
		b1.setCost(600);
		b1.setYearOfPublish(2024);
		b1.setTotalPages(900);
		System.out.println();
		
		System.out.println(b1.getBookName());
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getCost());
		System.out.println(b1.getTotalPages());
		System.out.println(b1.getYearOfPublish());
		System.out.println(BookDetails.getTotalBooks());
		
		
	}
}

