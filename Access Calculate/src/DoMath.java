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
		System.out.println(Calculate.toDegrees(1.57));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(2, 8, 5));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
	}
}
