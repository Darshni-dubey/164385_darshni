package assignment2;

public abstract class Example {

	public abstract void show();

	public abstract void display();

	public abstract void add(int a, int b);

	public static void main(String[] args) {

		ExampleSub obj = new ExampleSub();
		obj.show();
		obj.display();
		obj.add(20, 30);
	}
}
