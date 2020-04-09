package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmpSortUsingCollectionSort {

	public static void main(String[] args) {


		//without lambda
		ArrayList<EmployeeForTreeSet> t = new ArrayList<EmployeeForTreeSet>();
		t.add(new EmployeeForTreeSet("Shah",1678));
		t.add(new EmployeeForTreeSet("Bano",5647647));
		t.add(new EmployeeForTreeSet("New",675467));
		
		
		
		    Comparator com=new Comparator<EmployeeForTreeSet>()
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
		        };

			
		Collections.sort(t, com);
		System.out.println(t);
		
		//with lambda
		
		ArrayList<EmployeeForTreeSet> t1 = new ArrayList<EmployeeForTreeSet>();
		t1.add(new EmployeeForTreeSet("Shah",1678));
		t1.add(new EmployeeForTreeSet("Bano",5647647));
		t1.add(new EmployeeForTreeSet("New",675467));
		
		
		Collections.sort(t1, (a1,a2)-> 
		{
			
			if(a1.name.compareTo(a2.name)>0)
 				  return -1;
 			if(a1.name.compareTo(a2.name)<0)
 				  return +1;
 			  else
 				  return 0;
		
	        });

			System.out.println(t1);

    
	}

}
