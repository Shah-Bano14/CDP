package Bifunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsClass {

	@Test
	public void getProduct()
	{
		ArrayList<Product> al=createProduct();
		List<Product> s=al.stream().filter(p->p.getPrice()>1000).collect(Collectors.toList());
		System.out.println(s);

		
	}
	@Test
	public void getProductfromCategory()
	{
		ArrayList<Product> al=createProduct();
		List<Product> s=al.stream().filter(p->p.getPrice()>1000).collect(Collectors.toList());
		System.out.println(s);

		
	}
	
	public static ArrayList<Product> createProduct()
	{
		ArrayList<Product> al=new ArrayList<>();
		al.add(new Product("Shah", 1000000, "human", "premium"));
		al.add(new Product("xyz", 2000, "human", "premium"));

		al.add(new Product("bean", 800, "human", "premium"));
		return al;
		
	}
	
	@Test
	public void getProduct_Price_Electronic()
	{
		ArrayList<Product> al=createProduct();
		List<Product> s=al.stream().filter(p->p.getPrice()>1000).filter(p->p.getCategory().equals("human")).collect(Collectors.toList());
		System.out.println(s);

		
	}
	@Test
	public void getCount()
	{
		ArrayList<Product> al=createProduct();
		int count=(int) al.stream().filter(p->p.getCategory().equals("human")).count();
		System.out.println(count);

		
	}
	
}
