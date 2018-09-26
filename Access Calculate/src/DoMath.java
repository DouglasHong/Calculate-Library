/* This is the client code for the Calculate Library. 
 * Calls various methods in the Calculate Library.
 * @author Douglas Hong
 * @version 9/6/2018
 * 
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(6, 10));
		System.out.println(Calculate.average(5, 11, 29));
		System.out.println(Calculate.toDegrees(1.570795));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(2, 8, 5));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(10, 3));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(5, 2));
		System.out.println("Max3: " + Calculate.max(0.00, 0.00, -2.00));
		System.out.println(Calculate.min(80, 70));
		System.out.println(Calculate.round2(-1.1573));
		System.out.println(Calculate.exponent(3, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(20, 15));
		System.out.println(Calculate.sqrt(121));
	}
}

