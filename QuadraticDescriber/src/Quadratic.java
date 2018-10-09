/* This class is responsible for all the calculations and descriptions of the quadratic equation's graph. 
 * It contains some methods from the Calculate class and the quadraticDescriber method.
 * 
 * @author Douglas Hong
 * @version 10/3/2018
 */
public class Quadratic {
	// gets an equation in ax^2 + bx + c form and describes the parabola 
	public static String quadrDescriber(double a, double b, double c) {
		String equation = "Description of the graph of:\ny = " + a +" x^2 + " + b + " x + " + c;
		String direction;
		if(a < 0) {
			direction = "Opens: Down";
		}else {
			direction = "Opens: Up";
		}
		double xVertex = round2(-b / (2*a));
		double yVertex = round2(a * xVertex*xVertex + b*xVertex + c);
		String vertex = "Vertex: (" + xVertex + ", " + yVertex + ")";
		String xIntercept = quadForm(a, b, c);
		String intercepts = "x-intercept(s): " + xIntercept + " \ny-intercept: " + c;
		String fullDescription = equation + "\n\n" + direction + "\nAxis of Symmetry: " + xVertex + "\n" + vertex + "\n" + intercepts + "\n";
		return fullDescription;
	}
	//rounds a double to 2 decimal places
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
	//returns the absolute value of the number passed
	public static double absValue(double number) {
		if(number < 0) {
			return number*-1;
		}else {
			return number;
		}
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
	//raises a number/base to a positive integer power
	public static double exponent(double base, int power) {
		if(power < 0) {
			throw new IllegalArgumentException("The exponent method cannot raise the base to a negative power.");
		}
		double result = 1;
		for(int i = 0; i < power; i++) {
			result*=base;
		}
		return result;
	}
	//Uses coefficients of a quadratic formula to approximate real roots. If the discriminant is negative, there are no real roots. 
	public static String quadForm(double a, double b, double c) {
		if(a == 0) {
			throw new IllegalArgumentException("a cannot be 0 because the graph will not be a parabola and you cannot divide a number by 0.");
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
