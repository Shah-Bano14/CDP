package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UseomparatorforString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> al1=new ArrayList<String>();
		  al1.add("shah");
		  al1.add("bano");
		  al1.add("hello");
		  al1.add("world");
		Comparator com=new Comparator()
				{
			public int compare(Object ob1 , Object ob2) 
			{
				String a1=(String)ob1;
				String a2=(String)ob2;
				if(a1.compareTo(a2)>0)
					  return -1;
				if(a1.compareTo(a2)<0)
					  return +1;
				  else
					  return 0;
			}

				};
			Collections.sort(al1,com);
			System.out.println(al1);
//using lambda expression
ArrayList<String> al=new ArrayList<String>();
 al.add("shah");
al.add("bano");
al.add("hello");
al.add("world");
	  Collections.sort(al, (a1,a2)-> {
		
			if(a1.compareTo(a2)>0)
				  return -1;
			if(a1.compareTo(a2)<0)
				  return +1;
			  else
				  return 0;
	  });
	
	  System.out.println(al);
		
	}

}
