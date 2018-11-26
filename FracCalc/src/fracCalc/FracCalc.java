package fracCalc;
import java.util.*;
/* Does various operations (addition, subtraction, multiplication, and division) with two given fractions. 
 * 
 * @author Douglas Hong
 * @version 11/15/2018
 */
public class FracCalc {
	
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type the first operand(fraction), the operator (+,-,*,/), and the second operand (fraction) (Type 'quit' to quit)");
        String expression = userInput.nextLine();
        while(!expression.equalsIgnoreCase("quit")) {
        	System.out.println(produceAnswer(expression));
        	System.out.println("Please type the first operand(fraction), the operator (+,-,*,/), and the second operand (fraction) (Type 'quit' to quit)");
        	expression = userInput.nextLine();
        }
        System.out.println("Calculator stopped");
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
    	String[] splitInput = input.split(" ");
    	int wholeNum1 = getWholeNum(splitInput, 0);
    	int numerator1 = getNumerator(splitInput, 0);
    	int denominator1 = getDenominator(splitInput, 0);
    	int wholeNum2 = getWholeNum(splitInput, 2);
    	int numerator2 = getNumerator(splitInput, 2);
    	int denominator2 = getDenominator(splitInput, 2);
    	if(splitInput[1].equals("+")) {
    		add();
    	}else if(splitInput[1].equals("-")) {
    		subtract();
    	}else if(splitInput[1].equals("*")) {
    		multiply();
    	}else {
    		divide();
    	} 
        return ("whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2);
    	//return splitInput[2];
    }
    public static int getWholeNum(String[] input, int index) {
    	String wholeNum;
    	if(input[index].indexOf("_") != -1) {
    		wholeNum = input[index].substring(input[index].indexOf("_") - 1, input[index].indexOf("_"));
    	}else if(input[index].indexOf("_") == -1 && input[index].indexOf("/") == -1){
    		wholeNum = input[index];
    	}else{ //if(splitInput[2].indexOf("_") == -1)
    		wholeNum = "0";
    	}
    	return Integer.parseInt(wholeNum);
    }
    public static int getNumerator(String[] input, int index) {
    	String numerator;
    	if(input[index].indexOf("_") == -1 && input[index].indexOf("/") != -1) {
			numerator = input[index].substring(0, input[index].indexOf("/"));
		}else if(input[index].indexOf("_") != -1){
			numerator = input[index].substring(input[index].indexOf("_") + 1, input[index].indexOf("/"));
		}else {
			numerator = "0";
		}
    	return Integer.parseInt(numerator);
    }
    public static int getDenominator(String[] input, int index) {
    	String denominator;
    	if(input[index].indexOf("/") != -1) {
    		denominator = input[index].substring(input[index].indexOf("/") + 1, input[index].length());
    	}else {
    		denominator = "1";
    	}
    	return Integer.parseInt(denominator);
    }
    public static void toImproperFrac() {
    	
    }

    public static void add() {
    	
    }
    
    public static void subtract() {
    	
    }
    
    public static void multiply() {
    	
    }
    
    public static void divide() {
    	
    }
    
}
