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
    public static String produceAnswer(String input)
    { 
    	String[] splitInput = input.split(" ");
    	/*
    	String wholeNum2 = "";
    	String numerator2 = "";
    	String denominator2 = "";
    	if(splitInput[2].indexOf("/") != -1) {
    		denominator2 = splitInput[2].substring(splitInput[2].indexOf("/") + 1, splitInput[2].length());
    		numerator2 = splitInput[2].substring(splitInput[2].indexOf("/") - 1, splitInput[2].indexOf("/"));
    	}
    	if(splitInput[2].indexOf("_") != -1) {
    		wholeNum2 = splitInput[2].substring(splitInput[2].indexOf("_") - 1, splitInput[2].indexOf("_"));
    	} */
    	/*if(splitInput[1].equals("+")) {
    		add();
    	}else if(splitInput[1].equals("-")) {
    		subtract();
    	}else if(splitInput[1].equals("*")) {
    		multiply();
    	}else {
    		divide();
    	} */
        //return ("whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2);
    	return splitInput[2];
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
