package Labs;

public class PhoneNumLengthException extends Exception {
	private String phoneNumber;

	public PhoneNumLengthException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return "Invalid phone number Length: " + phoneNumber.length() + " digits.";
	}
	
}
