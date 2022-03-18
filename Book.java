package hw1;
public class Book {

	private int id;
	private String title;
	private Author author;
	private boolean borrowed;
	
	public Book(int id , String title, Author author) {
		this.id=id;
		this.title=title;
		this.author=author;		
	}
	public Book(int id, String title) {
		this.id=id;
		this.title=title;		
	}
	public boolean isBorrowed() {
		return this.borrowed;
	}
	public boolean borrowed() {				
		if(!this.borrowed) {
			this.borrowed=true;
		return true;
		}
		else return false;
		
	}
	public boolean returned(Book borrowedBook) {
		if(this.borrowed) {			 
			this.borrowed=false;
			return true;
		}else
			return false;		
	}	
	public String toString() {
		return "Book name is "+ this.title+ ", Author is "+ this.author.getName()+"."; 
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	

}
