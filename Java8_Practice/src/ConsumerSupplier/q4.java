package ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class q4 {

public static void main(String[] args) {
		
		ArrayList<Product1> al=new ArrayList<Product1>();
		al.add(new Product1("pro1*",589789,"electro","standard"));
		al.add(new Product1("pro2",767,"electro","standard"));
		Consumer<Product1> c=p->
		{
		    
	
			System.out.println(p.getName()+" "+p.getCategory()+" "+p.getPrice()+" "+p.getGrade());

		    
		};
		Predicate<String> pre=pr->
		{
			return pr.contains("*");
		};
		for(int i=0;i<al.size();i++)
		{
			if(pre.test(al.get(i).getName()))
				c.accept(al.get(i));
		}


	}

}
