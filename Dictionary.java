package hw1;

public class Dictionary extends Book{
	
	private int definitions;
	
	public Dictionary(int id, String title, Author author, int definitions) {
		super(id,title,author);		
		this.definitions = definitions;
	}
	public Dictionary(int id, String title, int definitions) {
		super(id,title);		
		this.definitions = definitions;
	}
	public String toString() {
		return  "Dictionary Name is " + getTitle() + ", definitions: "+ definitions;
	}
	public int getDefinitions() {
		return this.definitions;
	}
	public void setDefinitions(int definitions) {
		this.definitions = definitions;
	}
	

}
