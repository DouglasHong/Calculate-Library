import java.util.*;
/* Prints out an hourglass with user input and using less than 11 println/print statements (used 4 in the whole program)
 * 
 * @author Douglas Hong
 * @version 10/19/2018
 */

public class Hourglass {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		String quit;
		do {
			System.out.println("How many characters for the base? ");
			int numChars = console.nextInt();
			printBase(numChars);
			printTopHalf(numChars);
			printMiddle(numChars);
			printBottomHalf(numChars);
			printBase(numChars);
			System.out.println("Do you want to build another hourglass? (Type \"quit\" to end)");
			quit = console.next();
			quit = quit.toLowerCase();
		}while(!(quit.equals("quit")));
	}
	//prints the top and bottom base of the hourglass
	public static void printBase(int numChars) {
		printStringOfChars("|", 1);
		printStringOfChars("\"", numChars);
		newLine("|");
	}
	//prints the top half of the hourglass
	public static void printTopHalf(int numChars) {
		for(int i = 1; i < numChars/2; i++) {
			//j is looped until less than i because number of spaces = row number
			printStringOfChars(" ", i);
			printStringOfChars("\\", 1);
			//the count is numChars-2*i because the colons will decrease by 2 each row
			printStringOfChars(":", numChars-2*i);
			newLine("/");
		}
	}
	//prints the middle of the hourglass
	public static void printMiddle(int numChars) {
		//there are different numbers of "|" so the middle would look symmetrical
		if(numChars % 2 == 0) {
			printStringOfChars(" ", numChars/2);
			newLine("||");
		}else if(numChars % 2 != 0 && numChars >= 3){
			printStringOfChars(" ", numChars/2);
			newLine("|||");
		}else {
			printStringOfChars(" ", numChars/2 + 1);
			newLine("|");
		}
	}
	//prints the bottom half of the hourglass
	public static void printBottomHalf(int numChars){
		for(int i = 1; i < numChars/2; i++) {
			//the count has to be decrementing so there will be less spaces after each row
			printStringOfChars(" ", numChars/2 - i);
			printStringOfChars("/", 1);
			//the count is 2*i is so that there will be 2 more colons on each consecutive row
			printStringOfChars(":", 2*i);
			if(numChars % 2 != 0) {
				printStringOfChars(":", 1);
			}
			newLine("\\");
		}
	}
	//prints one character or a row of multiple characters
	public static void printStringOfChars(String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.print(s);
		}
	}
	//finishes off a line with the last String and moves on to the next one
	public static void newLine(String s) {
		System.out.println(s);
	}
}
