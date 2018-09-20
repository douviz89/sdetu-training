package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		// 1. Define the path that we want to write
		String fileName = "C:\\Users\\p077535\\Desktop\\Cours\\Become a Junior Java Software Developer\\Files\\fileToCreate.txt";
		String message = "I'm writing the data that will be placed in the file.";

		// 2. Create the file in java
		File file = new File(fileName);

		try {
			// 3. Open the file
			FileWriter fw = new FileWriter(file);

			// 4. Write to the file
			fw.write(message);

		} catch (IOException e) {
			System.out.println("ERROR: File Not Found: " + fileName);
			e.printStackTrace();
		} finally {
			System.out.println("Finished writing to the file.");
		}

	}

}
