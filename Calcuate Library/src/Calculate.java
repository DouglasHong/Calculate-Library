/* This class contains the methods to do various math-related tasks.
 * @author Douglas Hong
 * @version 9/6/2018
 */
public class Calculate {
	//returns square of an integer
	public static int square(int number) {
		return number*number;
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average(double x, double y) {
		return (x+y)/2;
	}
	public static double average(double x, double y, double z) {
		return (x+y+z)/3;
	}
	public static double toDegrees(double radians) {
		return (radians/3.14159)*180;
	}
	public static double toRadians(double angle) {
		return (angle/180)*3.14159;
	}
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	public static String toImproperFrac(int x, int y, int z) {
		return (((x*z)+y) + "/" + z);
	}
	public static String toMixedNum(int x, int y) {
		return (x/y + "_" + (x%y) + "/" + y);
	}
	public static String foil(int a, int b, int c, int d, int x, String e) {
		return ("");
	}
}
