package assignment2;

public class Singleton {
	private static Singleton single_instance = null;

	public String str;

	private Singleton() {
		str = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}
