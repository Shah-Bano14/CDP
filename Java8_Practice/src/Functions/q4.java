package Functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import PredicatesTasks.Products;

public class q4 {

	public static void main(String args[]){
		ArrayList<Products> al=new ArrayList<Products>();
		al.add(new Products("p1","electro","700"));
		al.add(new Products("p3","electro","10000"));
		al.add(new Products("p2","cosmetic","50"));
		
		Function<ArrayList<Products>, Integer> f1=p->{
			int sum=0;
			Predicate<String> p1=x->
			{
				return x.equals("electro");
			};
			
			for(int i=0;i<p.size();i++)
			{
				if(p1.test(p.get(i).getCategory()) )
				     sum+=Integer.valueOf(p.get(i).getPrice());
			}
			return sum;
		};
		System.out.println(f1.apply(al));
		
	}

}
