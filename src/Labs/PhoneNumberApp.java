package Labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {

		String phoneNumber = null;
		String fileName = "src/phoneNumber.txt";
		File file = new File(fileName);

		try {

			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNumber = br.readLine();

			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File Not Found: " + fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + fileName);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading data");
		}
		System.out.println("Phone Number: " + phoneNumber + ", Length: " + phoneNumber.length());
		// Valid phone number:
			// 10 digits long
			// Area code cannot start in 0 or 9
			// There can be 911 in the phone
		try {
			if (phoneNumber.length() != 10) {
				throw new PhoneNumLengthException(phoneNumber);
			}

			char firstChar = phoneNumber.charAt(0);
			if (firstChar == '0' || firstChar == '9') {
				throw new PhoneNumAreaCodeException(phoneNumber);
			}
		} catch (PhoneNumLengthException e) {
			System.out.println(e.toString());
		} catch (PhoneNumAreaCodeException e) {
			System.out.println(e.toString());
		} 
		

	}

}
