package PredicatesTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class q2 {
public static void main(String args[])
{
	
	HashMap<String,String> hm1=new HashMap<String,String>();
	hm1.put("p1", "cosmetics");
	hm1.put("p4", "electronics");
	hm1.put("p3", "wooden");
	Predicate<String> p= x->{
		return x.equals("electronics");
	};
	for(Map.Entry<String,String> e:hm1.entrySet() )
	{
		if(p.test(e.getValue()))
			System.out.println(e.getKey());
	}
	
}
	
}

