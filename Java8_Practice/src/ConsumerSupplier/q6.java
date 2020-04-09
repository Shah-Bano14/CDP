package ConsumerSupplier;

import java.util.function.Supplier;

public class q6 {

	public static void main(String[] args) {
		
		Supplier<String> s=()->
		{
			String a[]=new String[4];
			String finalres="";
			for(int i=0;i<4;i++)
			{
				int x=(int) (Math.random()*4);
			    a[i]=String.valueOf(x);
			}
			for(int i=0;i<4;i++)
			{
				finalres=finalres+a[i];
			}
			return finalres;
		};
		System.out.println(s.get());
	}

}
