package hw1;
import java.util.ArrayList;
public class Library {
	
	private ArrayList<Book> books =new ArrayList<>();;
	private ArrayList<Customer>customers=new ArrayList<>();
	
	public Library() {		
	}
	public void addBook(Book book) {	
		this.books.add(book);		
	}
	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}
	public int searchBook(String bookName) {
		if(books.contains(bookName)) {
			return 1;
		}
		else return -1;
	}
	public int searchCustomer(String customerName) {
		if(customers.contains(customerName)) {
			return 1;
		}
		else return -1;
	}
	public void borrowBook(String bookName, String personName) {
		if(!books.contains(bookName))
			System.out.println("Sorry, this book is not in our catalog");
		if(!customers.contains(personName))			
			System.out.println(personName+" is not a customer");
//***error
		if(books.isEmpty())
			System.out.println("This book is already borrowed!!");			
	}
	public void returnBook(String bookName,String personName) {
			if(!customers.contains(personName))
				System.out.println("Sorry, Ayse Caliskan is not a customer.");
	}
	public void listBorrowedBooks(String personName) {
		for(int i=0;i<customers.size();i++) {
			System.out.println("Customer: "+ customers.get(i)+ "borrowed ");
		}
	}
	public void printAvailableBooks() {
		for(int i=0;i<books.size();i++) {
			if(books.contains(i)) {
				System.out.println(books.get(i));
			}
		}	
	}
	public ArrayList<Book> getBooks(){		
		for(int i = 0 ; i < books.size() ; i++)
				System.out.println(books.get(i));		
	return books	;
	}
	public ArrayList<Customer> getCustomers(){		
		for(int i = 0;i < customers.size() ; i++)
			System.out.println(customers.get(i));
		return customers;
	}
	
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Library [books=" + books + ", customers=" + customers + "]";
	}	
}
