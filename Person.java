package hw1;

public class Person {
	private String name;
	private String birthDate;
	private String birthPlace;
	
	public Person(String name, int birthDate, String birthPlace) {
		
		this.name = name;
		this.birthDate = birthDate+" ";
		this.birthPlace = birthPlace;
	}

	public Person(String name, int birthDate) {
		
		this.name = name;
		this.birthDate = birthDate+" ";
	}

	public Person(String name) {
		
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return this.birthDate+" ";
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate+ " ";
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	
	public String toString() {
		
		return  name + " , Birth Date: "+ birthDate+ ", Birth Place: "+ birthDate;
	}
	
	
	
	

}
