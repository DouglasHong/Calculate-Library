import java.util.*;
/* Prints out an hourglass using less than 11 println statement
 * 
 * @author Douglas Hong
 * @version 10/19/2018
 */

public class Hourglass {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many rows? ");
		int numRows = console.nextInt();
		printBase(numRows);
		printTopHalf(numRows);
		printMiddle(numRows);
		printBottomHalf(numRows);
		printBase(numRows);
	}
	public static void printBase(int numRows) {
		String base = "|";
		for(int i = 0; i < numRows; i++) {
			base += "\"";
		}
		System.out.println(base + "|");
	}
	public static void printTopHalf(int numRows) {
		for(int i = 1; i <= numRows/2 - 1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			String line = "\\";
			for(int k = 0; k < numRows - 2*i; k++) {
				line += ":";
			}
			System.out.println(line + "/");
		}
	}
	public static void printMiddle(int numRows) {
		for(int i = 0; i < numRows/2; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	public static void printBottomHalf(int numRows){
		for(int i = 0; i < numRows/2 - 1; i++) {
			for(int j = numRows/2; j > 1+i; j--) {
				System.out.print(" ");
			}
			String line = "/";
			for(int k = 0; k < 2 + 2*i; k++) {
				line += ":";
			}
			System.out.println(line + "\\");
		}
	}
}
