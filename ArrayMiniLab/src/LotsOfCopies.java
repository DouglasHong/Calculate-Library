import java.util.Arrays;

public class LotsOfCopies {
	
	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		int a = 5;
		int b = a;
		a = 10;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		int a = 5;
		int b = a;
		a = 10;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		int a = 5;
		int b = a;
		a = 10;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str += str;
		arr[2] = 42;
	}
}
