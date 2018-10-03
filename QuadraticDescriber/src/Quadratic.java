/* This class is responsible for all the calculations. 
 * It contains all the Calculate classes and the quadraticDescriber method.
 * 
 * @author Douglas Hong
 * @version 10/3/2018
 */
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String direction;
		if(a < 0) {
			direction = "The graph opens down.";
		}else {
			direction = "The graph opens up.";
		}
	}
	public static double round2(double number) {
		if(number > 0) {
			number += 0.005;
		}else {
			number -= 0.005;
		}
		int castedNum = (int)(number*100);
		double roundNum = (double)(castedNum/100.0);
		return roundNum;
	}
	//asks for coefficients of a quadratic equation and returns the discriminant 
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	//returns the square root of the double passed; uses exponent method because square only works with int
	public static double sqrt(double number) {
		if(number < 0) {
			throw new IllegalArgumentException("You cannot square root a negative number and get a real answer.");
		}
		double root = number/2;
		if(number != 0) {
		while(absValue(number - exponent(root, 2)) > 0.005) {
				root = 0.5*((number/root)+root);
			}
		}
		return round2(root);
		}
	public static String quadForm(int a, int b, int c) {
		if(a == 0) {
			throw new IllegalArgumentException("a cannot be 0 because you cannot divide a number by 0.");
		}
		if(discriminant(a, b, c) < 0) {
			return "no real roots";
		}
		if(discriminant(a, b, c) == 0) {
			double singleRoot = round2(-b/(a*2));
			return "" + singleRoot;
		}
		double firstRoot = round2((-b + (sqrt(discriminant(a, b, c))))/(a*2));
		double secondRoot = round2((-b - (sqrt(discriminant(a, b, c))))/(a*2));
		if(firstRoot > secondRoot) {
			return secondRoot + " and " + firstRoot;
		}else {
			return firstRoot + " and " + secondRoot;
		}
	}
}
