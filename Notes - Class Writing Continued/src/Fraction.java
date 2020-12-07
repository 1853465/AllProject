
public class Fraction {
	private int numerator;
	private int denominator;
	
	/* what you call the parameters/arguments does not matter so long
	 * as they are sensical and reasonable names
	 */
	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	/*
	 * Complete the toString method so that a Fraction object
	 * is printed as numerator/denominator such as 3/4 or 5/4
	 */
	public String toString() {
		return numerator+"/"+denominator;
	}
	
	/* complete the method mixedFraction which represents the Fraction
	 * object as a mixed fraction IFF it is an improper fraction
	 * example(s)
	 *    5/4 -> 1 1/4
	 *    3/4 -> 3/4
	 *    10/2-> 5
	 *    3/2 -> 1 1/2
	 */
	public String mixedFraction() {
		if(numerator%denominator == 0) {
			String whole = numerator/denominator+" ";
			return whole;
		}
		else{
			return numerator/denominator+" "+(numerator%denominator)+"/"+denominator;
		}
	}
	public String add(Fraction f2) {
		if(f2.denominator==denominator) {
			int finalNum = f2.numerator+numerator;
			return finalNum+"/"+denominator;
		}
		else {
			int finalDen = f2.denominator*denominator;
			int newFNum = numerator*f2.denominator;
			int newF2Num = f2.numerator*denominator;
			int finalNum = newFNum+newF2Num;
			return finalNum+"/"+finalDen;
		}
	}
	public String multiply(Fraction f2) {
		int finalNum = numerator*f2.numerator;
		int finalDen = denominator*f2.denominator;
		return finalNum+"/"+finalDen;
	}
	public String reduce() {
		if(numerator%denominator==0) {
			int scale = numerator/denominator;
			int finalNum = numerator/scale;
			int finalDen = denominator/scale;
			return finalNum+"/"+finalDen;
		}
		else if(denominator%numerator==0) {
			int scale = denominator/numerator;
			int finalNum = numerator/scale;
			int finalDen = denominator/scale;
			return finalNum+"/"+finalDen;
		}
		else return numerator+"/"+denominator;
	}
	
	
}
