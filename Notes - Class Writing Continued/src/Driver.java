
public class Driver {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		System.out.println(c);
		
		//without a specific toString method
		//the memory address of the object is printed
		Dog d = new Dog(2); //no default constructor not valid wihtout int
		System.out.println(d); //to String is called automatically(d.toString())
		
		Cat felix = new Cat();
		System.out.println(felix.getName());
		
		//rectangel object
		Rectangle r1 = new Rectangle(2,2);
		Rectangle r2 = new Rectangle(3,5);
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());	
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());
		
		//fractions
		Fraction f = new Fraction(3,4);
		Fraction f2 = new Fraction(4,3	);
		System.out.println(f);
		System.out.println(f.mixedFraction());
		System.out.println(f.add(f2));
		System.out.println(f.multiply(f2));
		System.out.println(f2.reduce());
	}
	
}
