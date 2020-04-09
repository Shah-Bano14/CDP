package Bifunctions;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PredicatesTest {

	ArrayList<ResponseClass> resList;
	
	public ArrayList<ResponseClass> createResponses()
	{
		ArrayList<ResponseClass> resList=new ArrayList<ResponseClass>();
		resList.add(new ResponseClass("response body", "200", "JSON"));
		resList.add(new ResponseClass("response body", "400", "Text/html"));
		resList.add(new ResponseClass("response body", "400", "JSON"));
        return resList;
	}
	
	@Test
	public void checkStatusCode()
	{
		ArrayList<ResponseClass> resList=createResponses();
		Predicate<String> p=x->
		{
			return x.equals("400");
		};
	
		for(int i=0;i<resList.size();i++)
		{
			String x=resList.get(i).getStatusCode();
			if(p.test(x))
				System.out.println("the results are " +resList.get(i));
		}
	}
	@Test
	public void checkResponseType()
	{
		ArrayList<ResponseClass> resList=createResponses();
		Predicate<String> p=x->
		{
			return x.equals("JSON");
		};
	
		for(int i=0;i<resList.size();i++)
		{
			String x=resList.get(i).getResponseType();
			if(p.test(x))
				System.out.println("the results are " +resList.get(i));
		}
	}
	@Test
	public void checkResponseTypeAndStatusCode()
	{
		ArrayList<ResponseClass> resList=createResponses();
		BiPredicate<String,String> p=(x,y)->
		{
			return (x.equals("400")&&y.equals("JSON"));
		};
	
		for(int i=0;i<resList.size();i++)
		{
			String x=resList.get(i).getResponseType();
			String y=resList.get(i).getStatusCode();
			if(p.test(y,x))
				System.out.println("the results are " +resList.get(i));
		}
	}
	
	@Test
	public void checkResponseTypeOrStatusCode()
	{
		ArrayList<ResponseClass> resList=createResponses();
		BiPredicate<String,String> p=(x,y)->
		{
			return (x.equals("400")||y.equals("JSON"));
		};
	
		for(int i=0;i<resList.size();i++)
		{
			String x=resList.get(i).getResponseType();
			String y=resList.get(i).getStatusCode();
			if(p.test(y,x))
				System.out.println("the results are " +resList.get(i));
		}
	}
	@Test
	public void checkResponseTypeStatusCode()
	{
		ArrayList<ResponseClass> resList=createResponses();
		BiPredicate<String,String> p=(x,y)->
		{
			return (x.equals("400")==false && y.equals("JSON"));
		};
	
		for(int i=0;i<resList.size();i++)
		{
			String x=resList.get(i).getResponseType();
			String y=resList.get(i).getStatusCode();
			if(p.test(y,x))
				System.out.println("the results are " +resList.get(i));
		}
	}
}
