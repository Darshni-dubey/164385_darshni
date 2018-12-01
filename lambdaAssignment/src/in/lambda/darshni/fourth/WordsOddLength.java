package in.lambda.darshni.fourth;

import java.util.ArrayList;

public class WordsOddLength {
	public static void main(String[] args) {

		{ 
			ArrayList<String> words = new ArrayList<String>();

			words.add("test5");
			words.add("test56");
			words.add("test567");
			words.add("test5678");

			// apply removeIf() method
			words.removeIf(n -> (n.length() % 2 != 0));

			words.forEach(name -> {
				System.out.println(name);
			});
		}
	}
}