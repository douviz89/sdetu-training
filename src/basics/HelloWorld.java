package basics;

import java.io.IOException;
import java.io.StringReader;

public class HelloWorld {
	public static void main(String[] args) {
		try {
			int i;
			String chaine = "toto va à l'école";

			// creation du flux
			StringReader sr = new StringReader(chaine);

			// lecture et affichage des données
			while ((i = sr.read()) != -1) {
				System.out.println((char) i);
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
