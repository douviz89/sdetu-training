package basics;

import java.io.IOException;
import java.io.StringReader;

public class HelloWorld {
	public static void main(String[] args) {
		try {
			int i;
			String chaine = "toto va � l'�cole";

			// creation du flux
			StringReader sr = new StringReader(chaine);

			// lecture et affichage des donn�es
			while ((i = sr.read()) != -1) {
				System.out.println((char) i);
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
