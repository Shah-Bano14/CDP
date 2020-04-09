package lambda;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingEmpInTreeMap {

	public static void main(String[] args) {


		//without lambda
		TreeMap<EmployeeForTreeSet,Integer> t = new TreeMap<EmployeeForTreeSet,Integer>(new 
		        Comparator<EmployeeForTreeSet>()
		        {
             @Override
			public int compare(EmployeeForTreeSet a1 , EmployeeForTreeSet a2) 
			{
				
            	 if(a1.name.compareTo(a2.name)>0)
	   				  return -1;
	   			if(a1.name.compareTo(a2.name)<0)
	   				  return +1;
	   			  else
	   				  return 0;
			
		        }

			
		
	});
		t.put(new EmployeeForTreeSet("shah",1000),1);
		t.put(new EmployeeForTreeSet("bano",56000),2);
		t.put(new EmployeeForTreeSet("new",70000),3);
		System.out.println(t);
		
		//with lambda
		
		TreeMap<EmployeeForTreeSet,Integer> t1 = new TreeMap<EmployeeForTreeSet,Integer>((a1,a2)-> 
		{
			
			if(a1.name.compareTo(a2.name)>0)
 				  return -1;
 			if(a1.name.compareTo(a2.name)<0)
 				  return +1;
 			  else
 				  return 0;
		
	        });

		
	

		t1.put(new EmployeeForTreeSet("shah",1000),1);
		t1.put(new EmployeeForTreeSet("bano",56000),2);
		t1.put(new EmployeeForTreeSet("new",70000),3);
	System.out.println(t1);
	}

}
