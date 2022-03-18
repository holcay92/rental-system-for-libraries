package hw1;

import java.util.ArrayList;

public class Customer extends Person{
	private String address;
	private Book borrowedBook;
	private boolean borrowABook;
	private int maxNumberOfBooks;
	private ArrayList<Book>currentBooks=new ArrayList<>();
	
	public Customer (String name, String birthPlace, int birthDate, String address, int maxNumberOfBooks) {
		super(name,birthDate,birthPlace);
		this.address=address;
		this.maxNumberOfBooks=maxNumberOfBooks;
	}

	public Customer(String name, String birthPlace, int birthDate, String address){ 
		super(name , birthDate , birthPlace);		
		this.address=address;		
	}
	public Customer(String name , int birthDate , String address){
		super(name,birthDate);		
		this.address=address;
	}
	public Customer(String name, String address) {
		super(name);		
		this.address=address;
	}
	
	public Customer(String name , int birthDate) {
		super(name, birthDate);			
	}
	
	public void borrowAbook(Book b) {
		if(currentBooks.contains(b)) {
			System.out.println(" this book is already borrowed");		
		}
		currentBooks.add(b);
	}
	public void returnAbook(Book b) {
		if(!currentBooks.contains(b)) {
			System.out.println("This book is not borrowed, so you can not return it back!");
		}
		currentBooks.remove(b);
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void borrowABook() {
		this.setBorrowABook(true);
	}
	
	public void setBorrowABook(boolean borrowABook) {
		this.borrowABook = borrowABook;
	}
	public void returnABook() {
		if(this.borrowABook) {
			this.setBorrowABook(false);
			this.borrowedBook.returned(borrowedBook);
			System.out.println(this.getName()+ " succesfully returned "+ this.borrowedBook.getTitle());
		}
		else {
			System.out.println("Sorry, "+ this.getName()+" did not borrow a book");
		}
	}
	@Override
	public String toString() {
		
		return "Customer Name is "+ this.getName()+" and his/her maxNumberOfBooks is/are "+ maxNumberOfBooks;
				}

	public int getMaxNumberOfBooks() {
		return maxNumberOfBooks;
	}

	public void setMaxNumberOfBooks(int maxNumberOfBooks) {
		this.maxNumberOfBooks = maxNumberOfBooks;
	}

	public ArrayList<Book> getCurrentBooks() {
		return currentBooks;
	}

	public void setCurrentBooks(ArrayList<Book> currentBooks) {
		this.currentBooks = currentBooks;
	}
	

}
