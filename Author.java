package hw1;

public class Author extends Person {
	private String publisher;
	public Author (String name, String publisher, int birthDate) {
		super(name,birthDate);		
		this.publisher=publisher;	
	}
	@Override
	public String toString() {
		return "Author is " + this.getName();
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
