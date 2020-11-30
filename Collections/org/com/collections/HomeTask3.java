package org.com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class HomeTask3 {
	
	@Test
	public void homeTask()
	{
		Map<String,Integer> phoneDirectory = new HashMap<String,Integer>();
		int numberOfElements;
		Scanner sc= new Scanner(System.in);
		numberOfElements = sc.nextInt();
		for(int i=0;i<numberOfElements;i++)
		{
			phoneDirectory.put(sc.next(), sc.nextInt());
		}
		while(numberOfElements>0)
		{
			try {
				
				String key=sc.next();
				if(phoneDirectory.get(key)==null)
				{
					throw new NullException();
				}
				else
				{
					System.out.println(phoneDirectory.get(key));
				}
			}
			catch(Exception e)
			{
				System.out.println("Not Found");
			}
			numberOfElements--;
		}
		
	}

}
