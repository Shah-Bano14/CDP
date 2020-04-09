package ConsumerSupplier;

import java.util.function.Supplier;

public class q5 {

	public static void main(String[] args) {
		
		Supplier<Product1> s=()->
		{
			Product1 p=new Product1("shah",17,"electro","standard");
			return p;
		};
		System.out.println(s.get());
	}

}
