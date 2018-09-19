package exceptions;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {

		double payment = 0;
		boolean positivePayment = true;
		
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Enter the payment amount: ");

			try {
				payment = in.nextDouble();
				System.out.println(payment);
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				positivePayment = true;
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again");
				positivePayment = false;
			}
		} while (!positivePayment);
		System.out.println("Payment of " + payment + " € done.");
	}

}
