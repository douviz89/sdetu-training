package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args) {
		// 1. Set the file path
		String fileName = "C:\\Users\\p077535\\Desktop\\Cours\\Become a Junior Java Software Developer\\Files\\fileToRead.txt";
		String text = null;

		// 2. Create a java file
		File file = new File(fileName);

		try {
			// 3. Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));

			// 4. Read the data
			text = br.readLine();

			// 5. Close the resources
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
		System.out.println("DATA: \n" + text);
	}
}