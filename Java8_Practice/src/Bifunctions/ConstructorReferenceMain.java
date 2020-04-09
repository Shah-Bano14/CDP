package Bifunctions;

public class ConstructorReferenceMain {

	public static void main(String[] args) {
		ConsRefInterface i=Product::new;
		System.out.println(i.get("Shah", 1000000, "human", "premium"));
		
	}

}
