package lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSortingInteger {

	public static void main(String[] args) {
		
		//with anonymous class
		TreeSet<Integer> t = new TreeSet<Integer>(new 
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
		t.add(5667);
		t.add(67);
		t.add(14);
		System.out.println(t);
    
		
		
		//with lambda expression
		
		TreeSet<Integer> t1=new TreeSet<Integer>((a1,a2)->{
			if(a1>a2)
				  return -1;
			  if(a1<a2)
				  return +1;
			  else
				  return 0;
		
		});
		t1.add(667);
		t1.add(65);
		t1.add(45);
		System.out.println(t1);
}
}
