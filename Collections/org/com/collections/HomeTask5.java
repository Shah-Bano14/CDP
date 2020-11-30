package org.com.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class HomeTask5 {
	
	@Test
	public void hometask()
	{
		SortedMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		int query,size;
		Scanner sc= new Scanner(System.in);
		query=sc.nextInt();
		for(int i=0;i<query;i++)
		{
			size=sc.nextInt();
			for(int j=0;j<size;j++)
			{
				String choice=sc.next();
				if(choice.equals("a"))
				{
					map.put(sc.nextInt(),sc.nextInt());
				}
				else if(choice.equals("b"))
				{					
					try
					{	int key = sc.nextInt();
						int value=map.get(key);
						System.out.print(map.get(key)+" ");
					}
					catch(Exception e)
					{
						System.out.print("-1"+" ");
					}
				}
				else if(choice.equals("c"))
				{
					System.out.print(map.size()+" ");
				}
				else if(choice.equals("d"))
				{
					map.remove(sc.nextInt());
				}
				else if(choice.equals("e"))
				{
					System.out.print(map.keySet());
				}
					
			}
			//map clear

			for(Map.Entry<Integer, Integer> entry :map.entrySet() ) {
  
				map.remove(entry.getKey());
				}			
		}
	}

}
