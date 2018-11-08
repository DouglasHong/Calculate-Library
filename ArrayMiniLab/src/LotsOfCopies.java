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
		part2WithInts();
		part2WithStrings();
		part2WithIntArrays();
		part2WithStringArrays();
	}
	public static void changeMe(int x, String str, int[] arr) {
		x++;
		str += str;
		arr[2] = 42;
	}
	public static void part2WithInts() {
		System.out.println("Part 2");
		int a = 7; //a = startValue
		int b = a; //b = a
		a = 1; //a = newValue
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithStrings() {
		String a = "good"; //a = startValue
		String b = a; //b = a
		a = "bad"; //a = newValue
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithIntArrays() {
		int[] a = {2, 4, 6}; //a = startValue
		int[] b = a; //b = a
		a[1] = 10; //a = newValue
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
	public static void part2WithStringArrays() {
		String[] a = {"hi" , "hello", "bye"}; //a = startValue
		String[] b = a; //b = a
		a[1] = "goodbye"; //a = newValue
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
}
