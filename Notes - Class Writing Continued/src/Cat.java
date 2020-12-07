
public class Cat {
	private int age;
	private String name;
	
	public Cat() {
		age = 0;
		name = "Felix";
	}
	
	//getters or accessors(give people access to class
	//getter of the age attrubute of a Cat
	public int getAge() {
		return age;
	}
	//getter for the name attribute of a Cat
	public String getName() {
		return name;
	}
	
	public String toString() {
		//return a String representation of a cat object
		return name+" "+age;
	}
}
