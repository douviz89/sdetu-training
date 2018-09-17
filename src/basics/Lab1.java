package basics;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {

		int n = 4;
		int values[] = { 10, 3, 4, 20, 6, 7, 8, 9, 1 };

		System.out.println("****************** SUM ******************");
		System.out.println();
		System.out.println("The sum of " + n + " is : " + sum(n));
		System.out.println();

		System.out.println("*************** FACTORIAL ***************");
		System.out.println();
		System.out.println("The factorial of " + n + " is : " + fact(n));
		System.out.println();

		System.out.println("******* ARRAYS: MIN, AVG & MAX **********");
		System.out.println();

		System.out.println("Array = " + Arrays.toString(values));
		System.out.println("The minimum of array is : " + min(values));
		System.out.println("The average of array is : " + avg(values));
		System.out.println("The maximum of array is : " + max(values));

	}

	public static int sum(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int fact(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	public static int min(int array[]) {

		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int max(int array[]) {

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static double avg(int array[]) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
//		System.out.println("The sum = "+sum);
//		System.out.println("Array's length = "+ array.length);
		return (double) sum / array.length;
	}

}
