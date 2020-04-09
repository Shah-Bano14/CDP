package lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmployeeStringSort {

	public static void main(String[] args) {
		
		
		//without lambda
				TreeSet<EmployeeForTreeSet> t = new TreeSet<EmployeeForTreeSet>(new 
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
				t.add(new EmployeeForTreeSet("shah",1000));
				t.add(new EmployeeForTreeSet("bano",56000));
				t.add(new EmployeeForTreeSet("new",70000));
				System.out.println(t);
		    
				//with lambda
				
				
				TreeSet<EmployeeForTreeSet> t1 = new TreeSet<EmployeeForTreeSet>((a1,a2)-> 
					{
						
						if(a1.name.compareTo(a2.name)>0)
			   				  return -1;
			   			if(a1.name.compareTo(a2.name)<0)
			   				  return +1;
			   			  else
			   				  return 0;
					
				        });

					
				
	
				t1.add(new EmployeeForTreeSet("shah",1000));
				t1.add(new EmployeeForTreeSet("bano",56000));
				t1.add(new EmployeeForTreeSet("new",70000));
				System.out.println(t1);
		    

	}

}
