import java.util.*;
/* This class prints out the ingredients between the bread of a sandwich using String.split(). 
 * It has two methods: one that handles the sandwich without spaces, and one that handles it with spaces
 * 
 * @author Douglas Hong
 * @version 11/2/18
 */
public class Split {
	public static void main(String[] args) {
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		String[] applesArray = "I really like reallyreally red apples".split("really");
		System.out.println(Arrays.toString(applesArray));
		System.out.println(Arrays.toString(middleSandwich("applespineapplesbreadlettucetomatobaconmayohambreadcheese")));
		System.out.println(Arrays.toString(middleSandwich("lettuceketchuppineapplebreadbaconlettucetomatoonionpepperbreadhamcheesebacon")));
		System.out.println(Arrays.toString(middleSandwichWithSpaces("apples pineapples bread lettuce tomato bacon mayo ham bread cheese")));
		System.out.println(Arrays.toString(middleSandwichWithSpaces("pineapple cheese bread onion tomato onion bacon lettuce mustard bread mustard pepper mayo pineapple")));
	}
	//gets a String of food with no spaces in between and finds what is between the pieces of bread
	public static String[] middleSandwich(String food) {
		int breadIndex1 = food.indexOf("bread");
		food = food.substring(breadIndex1 + 5, food.length());
		while(food.indexOf("bread") != -1) {
			int breadIndex2 = food.indexOf("bread");
			
		}
		int breadIndex2 = food.indexOf("bread");
		food = food.substring(0, breadIndex2);
		String[] middle = food.split("bread");
		return middle;
	}
	//gets a String of food with spaces in between and finds what is between the pieces of bread
	public static String[] middleSandwichWithSpaces(String food) {
		return middleSandwich(Arrays.toString(food.split(" ")));
	}
}
