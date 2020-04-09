package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseComparatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al1=new ArrayList<Integer>();
		  al1.add(25);
		  al1.add(78);
		  al1.add(44);
		  al1.add(14);
		Comparator com=new Comparator()
				{
			public int compare(Object ob1 , Object ob2) 
			{
				int a1=(int)ob1;
				int a2=(int)ob2;
				if(a1>a2)
					  return -1;
				  if(a1<a2)
					  return +1;
				  else
					  return 0;
			}

				};
			Collections.sort(al1,com);
			System.out.println(al1);
//using lambda expression
 ArrayList<Integer> al=new ArrayList<Integer>();
	  al.add(25);
	  al.add(78);
	  al.add(44);
	  al.add(14);
	  Collections.sort(al, (a1,a2)-> {
		  if(a1>a2)
			  return -1;
		  if(a1<a2)
			  return +1;
		  else
			  return 0;
	  });
	
	  System.out.println(al);
	  
	}

}
