package zorgApp;

public class profiles {
	private String firstName;
	private String lastName;
	private int age;
	
	public profiles(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	//Getters
	public String getFirstName() {	
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	//Setters
	public void setName1(String newFirstName) {	
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
}
