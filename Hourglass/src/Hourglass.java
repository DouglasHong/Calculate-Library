/* Prints out an hourglass using less than 11 println statement
 * 
 * @author Douglas Hong
 * @version 10/19/2018
 */

public class Hourglass {
	public static void main (String[] args) {
		printBase();
		printTopHalf();
		printMiddle();
		printBottomHalf();
		printBase();
	}
	public static void printBase() {
		String base = "|";
		for(int i = 0; i < 10; i++) {
			base += "\"";
		}
		System.out.println(base + "|");
	}
	public static void printTopHalf() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 1+i; j++) {
				System.out.print(" ");
			}
			String line = "\\";
			for(int k = 0; k < 8 - 2*i; k++) {
				line += ":";
			}
			System.out.println(line + "/");
		}
	}
	public static void printMiddle() {
		for(int i = 0; i < 5; i++) {
			System.out.print(" ");
		}
		System.out.println("||");
	}
	public static void printBottomHalf(){
		for(int i = 0; i < 4; i++) {
			for(int j = 5; j > 1+i; j--) {
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
