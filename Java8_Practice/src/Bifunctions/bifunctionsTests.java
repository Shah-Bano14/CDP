package Bifunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import org.testng.annotations.Test;

public class bifunctionsTests {

	@Test
	public void createProduct()
	{
		System.out.println("enter name and price of product");
		String name="machine";
		int price=10000;
		BiFunction<String, Integer,Product > f=(n,p)->
		{
			Product np=new Product(n,p,"electro","premium");
			return np;
		
		};
		System.out.println(f.apply(name, price));
		
	}
	
	@Test
	public void calCostOfCart()
	{
		HashMap<Product, Integer> hm=new HashMap<>();
		int cost=0;
		hm.put(new Product("p1",500,"electro","premium"), 5);
		hm.put(new Product("p2",1400,"electro","premium"), 14);
		hm.put(new Product("p1",1000,"electro","premium"), 10);
		BiFunction<Integer,Integer,Integer> func=(price,quan)->
		{
			return price*quan;
		};
		for(Map.Entry<Product, Integer> e:hm.entrySet())
		{
			cost+=func.apply(e.getKey().getPrice(), e.getValue());
		}
		System.out.println("the cost of cart is "+cost);
	}
}
