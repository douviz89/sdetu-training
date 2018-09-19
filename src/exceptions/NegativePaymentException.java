package exceptions;

public class NegativePaymentException extends Exception{

	private double payment;
	
	public NegativePaymentException(double payment) {
		this.payment = payment;
	}
	
	public String toString() {
		return "Error : Cannot take negative payment: "+payment;
		
	}
}
