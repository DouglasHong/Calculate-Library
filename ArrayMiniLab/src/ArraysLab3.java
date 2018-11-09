import java.util.Arrays;

/* This class has various methods that alter or calculate values in the array passed.
 * 
 * @author Douglas Hong
 * @version 11/9/2018
 * 
 */
public class ArraysLab3 {

	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		System.out.println("sumArr: " + Arrays.toString(sumArr));
		System.out.println("appendArr: " + Arrays.toString(appendArr));
		System.out.println("removeArr: " + Arrays.toString(removeArr));
		System.out.println("sumOfEvens: " + sumOfEvens);
		System.out.println("a1: " + Arrays.toString(a1));
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sumArr = new int[arr1.length];
		for(int i = 0; i < sumArr.length; i++) {
			sumArr[i] = arr1[i] + arr2[i];
		}
		return sumArr;
	}
	public static int[] append(int[] arr, int num) {
		int[] appendArr = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			appendArr[i] = arr[i];
		}
		appendArr[appendArr.length-1] = num;
		return appendArr;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] removedArr = new int[arr.length-1];
		int currentIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != idx) {
				removedArr[currentIndex] = arr[i];
				currentIndex++;
			}
		}
		return removedArr;		
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
}
