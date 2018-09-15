/* This class contains the methods to do various math-related tasks.
 * @author Douglas Hong
 * @version 9/6/2018
 */
public class Calculate {
	//returns square of an integer
	public static int square(int number) {
		return number*number;
	}
	//returns cube of an integer
	public static int cube(int number) {
		return number*number*number;
	}
	//returns the average of two numbers
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	//returns the average of three numbers
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	//converts an angle measure given in radians to degrees
	public static double toDegrees(double radians) {
		return (radians/3.14159)*180;
	}
	//converts an angle measure in degrees to radians
	public static double toRadians(double angle) {
		return (angle/180)*3.14159;
	}
	//returns the discriminant of a quadratic equation
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	//converts a mixed number to an improper fraction 
	public static String toImproperFrac(int wholeNum, int numerator, int denominator) {
		return (((wholeNum*denominator)+numerator) + "/" + denominator);
	}
	//converts an improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator + "_" + (numerator%denominator) + "/" + denominator);
	}
	//converts binomial form (ax+b)(cx+d) to a quadratic equation of the form ax^2 + bx + c
	public static String foil(int a, int b, int c, int d, String variable) {
		int firstTerm = a*c;
		int secondTerm = (a*d) + (b*c);
		int thirdTerm = b*d;
		return (firstTerm + variable + "^2 + " + secondTerm + variable + " + " + thirdTerm);
	}
	//determines if a number is evenly divisible by another number
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	//returns the absolute value of the number passed
	public static double absValue(double number) {
		if(number < 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	//returns the larger value out of two numbers
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//returns the larger value of three numbers
	public static double max(double num1, double num2, double num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}else if(num2 > num1 && num2 > num3) {
			return num2;
		}else {
			return num3;
		}
	}
	//returns the smaller value of two numbers
	public static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//rounds a double to two decimal places
	public static double round2(double num) {
		int castedNum = (int)(num*100.0);
		double roundNum = ((double)castedNum)/100.0;
		return roundNum;
	}
	//raises a number to a positive integer power
	public static double exponent(double base, int power) {
		double product = base;
		for(int i = 0; i < power-1; i++) {
			product *= base;
		}
		return product;
	}
	//returns the factorial of the number passed
	public static int factorial(int num) {
		int product = 1;
		for(int i = 1; i <= num; i++) {
			product *= i;
		}
		return product;
	}
	//determines if the integer passed is a prime number or not
	public static boolean isPrime(int num) {
		for(int i = 2; i <= num; i++) {
			if(isDivisibleBy(num, i) && i != num) {
				return false;
			}
		}
		return true;
	}
	//determines the greatest common factor of two integers 
	public static int gcf(int num1, int num2) {
		int greatestFactor = 1;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				greatestFactor = i;
			}
		}
		return greatestFactor;
	}
	//returns the square root of the double passed
	public static double sqrt(double num) {
		double guess = num/2;
		double root = 0;
		if(num != 0) {
			while(root != (num/guess + guess)/2) {
				root = (num/guess + guess)/2;
				guess = root;
			}
		}
		return root;
	}
}
