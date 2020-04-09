package lambda;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortIntegerInTreeMap {

	public static void main(String[] args) {

 
		// anonymous class
		TreeMap<Integer,String> t = new TreeMap<>(new 
		        Comparator<Integer>()
		        {
             @Override
			public int compare(Integer a1 , Integer a2) 
			{
				
				if(a1>a2)
					  return -1;
				  if(a1<a2)
					  return +1;
				  else
					  return 0;
			
		        }

			
		
	});
		t.put(5667,"Shah");
		t.put(67,"bano");
		t.put(14,"new");
		System.out.println(t);
		
		
		//lambda expression
		
		TreeMap<Integer,String> t1=new TreeMap<Integer,String>((a1,a2)->{
			if(a1>a2)
				  return -1;
			  if(a1<a2)
				  return +1;
			  else
				  return 0;
		
		});
		t1.put(5667,"Shah");
		t1.put(67,"bano");
		t1.put(14,"new");
		System.out.println(t1);	
		
	}

}
