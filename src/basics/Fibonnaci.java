package basics;

public class Fibonnaci {

	public static void main(String[] args) {
		
		int n= 1;
		System.out.println("Fibonnaci of "+ n +" is : " + fib(n));

	}

	public static int fib(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}

	}

}
