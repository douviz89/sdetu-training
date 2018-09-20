package Labs;

public class PhoneNumAreaCodeException extends Exception {
	private String phoneNumber;

	public PhoneNumAreaCodeException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "ERROR: Invalid Area Code: " + phoneNumber;
	}
}
