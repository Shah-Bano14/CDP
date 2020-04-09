package Functions;

import java.util.ArrayList;
import java.util.function.Function;

import PredicatesTasks.Products;

public class q1 {

	public static void main(String args[]){
		ArrayList<Products> al=new ArrayList<Products>();
		al.add(new Products("p1","electro","20"));
		al.add(new Products("p3","electro","100"));
		al.add(new Products("p2","cosmetic","50"));
		Function<ArrayList<Products>, Integer> f1=p->{
			int sum=0;
			for(int i=0;i<p.size();i++)
			{
				sum+=Integer.valueOf(p.get(i).getPrice());
			}
			return sum;
		};
		System.out.println(f1.apply(al));
		
	}
}
