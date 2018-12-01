package in.lambda.darshni.six;

import java.util.Arrays;
import java.util.List;

public class UpperCaseConvertion {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three");
		
		list.stream().map(str -> str.toUpperCase())
				.forEach(str -> System.out.println("Uppercase:" + str));

	}

}
