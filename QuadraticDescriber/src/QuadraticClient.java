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
		System.out.println("Welcome to the Quadratic Describer\nProvide values for coefficients a, b, and c");
		String quit;
		do {
			System.out.print("\na: ");
			double a = userInput.nextDouble();
			System.out.print("b: ");
			double b = userInput.nextDouble();
			System.out.print("c: ");
			double c = userInput.nextDouble();
			System.out.println("\n" + Quadratic.quadrDescriber(a,b,c));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			quit = userInput.next();
			quit = quit.toLowerCase();
		}while(!(quit.equals("quit")));
	}
}
