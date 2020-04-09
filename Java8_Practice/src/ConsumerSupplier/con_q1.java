package ConsumerSupplier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.function.Consumer;

public class con_q1 {

	public static void main(String args[])throws IOException
	{
		Product1 p=new Product1("computer",50000,"electronic","first");
		Scanner sc=new Scanner(System.in);
		Consumer<Product1> c1=p1->
		{
			System.out.println(p1.getName()+" "+p1.getCategory()+" "+p1.getPrice()+" "+p1.getGrade());
		};
		Consumer<Product1> c2=p2->
		{
			String filecontent=p2.getName()+" "+p2.getCategory()+" "+p2.getPrice()+" "+p2.getGrade();
			BufferedWriter wr;
			try {
			wr=new BufferedWriter(new FileWriter("C:/Users/Shah_Bano/Pictures/file1.txt"));
			
				wr.write(filecontent);
				wr.close();
				System.out.println("written in file");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		System.out.println("enter the choice 1: console 2: file");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			c1.accept(p);
			break;
		case 2:
			c2.accept(p);
			break;
		default:
			System.out.println("invalid input");
		}
		
	}
}
