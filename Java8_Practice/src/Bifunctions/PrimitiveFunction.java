package Bifunctions;

import java.util.ArrayList;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

import org.testng.annotations.Test;

import io.netty.util.IntSupplier;

public class PrimitiveFunction {

	@Test
	public void isPrimeNumber()
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(7);
		al.add(9);
		al.add(13);
		IntPredicate i=x->
		{
		for(int j=2;j<x/2;j++)
		{
			if(x%j==0)
				return false;
		}
		return true;
		};
		for(int j=0;j<al.size();j++)
		{
			if(i.test(al.get(j)))
					System.out.println(al.get(j));
		}
	}
	
	@Test
	public void squareOfANumber()
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(7);
		al.add(9);
		al.add(13);
		IntConsumer i=x->
		{
		System.out.println(x*x);
		};
		for(int j=0;j<al.size();j++)
		{
			i.accept(al.get(j));
				
		}
	
	}
	
	@Test
	public void randomGenerate() throws Exception
	{
		IntSupplier i=()->
		{
			int x=(int)(5000*Math.random())+5000;
			return x;
		};
		System.out.println(i.get());
	}
	
}
