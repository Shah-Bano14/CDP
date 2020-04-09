package ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class q3 {

public static void main(String[] args) {
		
		ArrayList<Product1> al=new ArrayList<Product1>();
		al.add(new Product1("pro1",589789,"electro","standard"));
		al.add(new Product1("pro2",767,"electro","standard"));
		Consumer<Product1> c=p->
		{
		    String namenew=p.getName()+"*";
	
			System.out.println(namenew+" "+p.getCategory()+" "+p.getPrice()+" "+p.getGrade());

		    
		};
		Predicate<Integer> pre=pr->
		{
			return pr>3000;
		};
		for(int i=0;i<al.size();i++)
		{
			if(pre.test(al.get(i).getPrice()))
				c.accept(al.get(i));
		}


	}

}
