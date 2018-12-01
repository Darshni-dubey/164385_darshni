package in.lambda.darshni.second;

public class Order {
	private double price;
	private String name;
	boolean isAccepted;
	public Order(double price, String name,boolean isAccepted) {
		this.price = price;
		this.name = name;
		this.isAccepted=isAccepted;
	}

	public boolean isAccepted() {
		return isAccepted;
	}

	public boolean getAccepted() {
		return isAccepted;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [price=" + price + " name=" + name + "isAccepted="+isAccepted+"]";
	}
}
