package PredicatesTasks;

import java.util.ArrayList;
import java.util.function.Predicate;

public class q4 {

	public static void main(String args[])
	{
		ArrayList<Products> al=new ArrayList<Products>();
		al.add(new Products("p1","electro","200"));
		al.add(new Products("p3","electro","100"));
		al.add(new Products("p2","cosmetic","50"));
		Predicate<String> p1=x->{
			return x.equals("electro");
		};
		Predicate<String> p2=y->{
			return Integer.valueOf(y)>100;
		};
		
		for(int i=0;i<al.size();i++)
		{
			if(p1.test(al.get(i).getCategory()) || p2.test(al.get(i).getPrice()))
                		  System.out.println(al.get(i).getName());
		}
	
	}
}
