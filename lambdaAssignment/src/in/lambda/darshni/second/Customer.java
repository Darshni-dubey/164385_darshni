package in.lambda.darshni.second;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<Order>();
		Order od1 = new Order(20000,"a",true);
		Order od2 = new Order(11000,"b", false);
		Order od4 = new Order(1000,"b", true);
		Order od3 = new Order(1200,"c",false);

		list.add(od1);
		list.add(od2);
		list.add(od3);
		list.add(od4);
		list.forEach(l->{
			if(l.getPrice()>10000 && l.getAccepted()){
				System.out.println(l+"Accepted");
			}
		});
	}
}