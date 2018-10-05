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
		boolean go = true;
		while(go == true) {
			System.out.println("Provide values for coefficicents a, b, and c");
			System.out.println("a: ");
			double a = userInput.nextDouble();
			System.out.println("b: ");
			double b = userInput.nextDouble();
			System.out.println("c: ");
			double c = userInput.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a,b,c));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String quit = userInput.nextLine();
			if(quit.equals("quit")) {
				break;
			}
		}
	}
}
