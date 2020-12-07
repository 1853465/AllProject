
public class Dog {
	private int age;
	private String name;
	
	
	public Dog(int paramAge) {
		//assign the age attribute to the "input" aka parameter/argument
		//recall that this value is coming from some other set of code
		age = paramAge;
	}
	
	//getter writing practice
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	
	//to String allows a text representation
	//of objects of this type
	public String toString() {
		String result = "Name: "+name+":"+" Age: "+age;
		return result;
	}
}
