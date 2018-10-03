import java.util.*;
/* This class will handle interactions with the user. 
 * It calls the method quadrDescriber with the appropriate arguments.
 * 
 * @author Douglas Hong
 * @version 10/3/2018
 */
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please type the value for a");
		double a = userInput.nextDouble();
		System.out.println("Please type the value for b");
		double b = userInput.nextDouble();
		System.out.println("Please type the value for c");
		double c = userInput.nextDouble();
		System.out.println(Quadratic.quadrDescriber(a,b,c));
	}
}
