package in.lambda.darshni.fifth;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FirstLetterString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Darshni");
		list.add("Yanshi");
		list.add("Dubey");
		String first = list.stream().map(s -> s.substring(0,1)).collect(Collectors.joining());
		System.out.println(first);
}
}