package org.com.collections;


import java.util.ArrayList;
import java.util.Scanner;

import org.testng.annotations.Test;

public class HomeTask1 {
	
	@Test
	public void homeTask()
	{
		int arrayCount;
		int sizeOfArray;
		Scanner sc= new Scanner(System.in);
		arrayCount=sc.nextInt();
		ArrayList<Integer> list[]= new ArrayList[arrayCount];
		ArrayList<Integer> l= new ArrayList<Integer>();
		
		  for(int i=0;i<arrayCount;i++) 
		  {
			  sizeOfArray=sc.nextInt();
			  for(int j=0; j<sizeOfArray;j++) 
			  { 
				  l.add(sc.nextInt());
			  } 
			  list[i] = (ArrayList<Integer>) l.clone();
			  l.clear();
		  }
		  int queryCount=sc.nextInt();
		  for(int queryNumber=0;queryNumber<queryCount;queryNumber++)
		  {
			  try {
				  int result= list[sc.nextInt()-1].get(sc.nextInt()-1);
				  System.out.println(result);
			  }
			  catch(Exception e)
			  {
				  System.out.println("ERROR!");
			  }
			  
		  }
	}

}
