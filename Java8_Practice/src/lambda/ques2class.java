package lambda;

import java.util.ArrayList;
import java.util.Collections;

import lambdaIntefaces.ques2Interface;

public class ques2class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(44);
		a.add(22);
		//without lambda expression 
		ques2Interface q1=new ques2Interface(){

			@Override
			public int secndBigNUm(ArrayList a) {
				Collections.sort(a);
				return (int) a.get(a.size()-1);
		
			}
			
		};
		System.out.println(q1.secndBigNUm(a));
		//with lambda expression 
		ArrayList<Integer> b=new ArrayList<>();
		b.add(1);
		b.add(2);
		b.add(44);
		b.add(22);
		ques2Interface q2=(c)->{
			Collections.sort(c);
			return (int) c.get(c.size()-1);
	};
	System.out.println(q2.secndBigNUm(b));

}
}
