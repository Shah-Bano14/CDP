package org.com.collections;

import java.util.Scanner;
import java.util.Stack;

import org.testng.annotations.Test;

public class HomeTask4 {
	
	@Test
	public void homeTask()
	{
		Stack<String> stack = new Stack<String>();
		String input;
		Scanner sc=new Scanner(System.in);
		input=sc.next();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==')')
			{
				if(!stack.isEmpty() && stack.peek().equals("("))
				{
					stack.pop();
				}
				else
				{
					stack.push(input.charAt(i)+"");
				}
			}
			else if(input.charAt(i)=='}')
			{
				if(!stack.isEmpty() && stack.peek().equals("{"))
				{
					stack.pop();
				}
				else
				{
					stack.push(input.charAt(i)+"");
				}
			}
			else if(input.charAt(i)==']')
			{
				if(!stack.isEmpty() && stack.peek().equals("["))
				{
					stack.pop();
				}
				else
				{
					stack.push(input.charAt(i)+"");
				}
			}
			else
			{
				stack.push(input.charAt(i)+"");
			}
			
		}
		System.out.println(stack.isEmpty());
	}

}

