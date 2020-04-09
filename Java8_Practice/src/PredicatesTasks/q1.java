package PredicatesTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class q1 {
public static void main(String args[])
{
	
	HashMap<String,Integer> hm1=new HashMap<String,Integer>();
	hm1.put("p1", 1000);
	hm1.put("p2", 2000);
	hm1.put("p3", 500);
	Predicate<Integer> p= x->{
		return x>1000;
	};
	for(Map.Entry<String, Integer> e:hm1.entrySet() )
	{
		if(p.test(e.getValue()))
			System.out.println(e.getKey());
	}
	
}
	
}

