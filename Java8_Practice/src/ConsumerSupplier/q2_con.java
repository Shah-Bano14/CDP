package ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class q2_con {

	public static void main(String[] args) {
		
		ArrayList<Product1> al=new ArrayList<Product1>();
		al.add(new Product1("pro1",589789,"electro","standard"));
		al.add(new Product1("pro2",767,"electro","standard"));
		Consumer<Product1> c=p->
		{
		    String gradenew=p.getGrade();
		    gradenew="Premium";
			System.out.println(p.getName()+" "+p.getCategory()+" "+p.getPrice()+" "+gradenew);

		    
		};
		Predicate<Integer> pre=pr->
		{
			return pr>1000;
		};
		for(int i=0;i<al.size();i++)
		{
			if(pre.test(al.get(i).getPrice()))
				c.accept(al.get(i));
		}


	}

}
