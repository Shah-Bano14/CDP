package lambda;


public class lambdaClass {
	
	public static void main(String[] args)
	{
		LambdaInterface l1= new LambdaInterface(){
			@Override
	        public void print1()
	{
				System.out.println("hello lambda expression");
	}
			
		};
		l1.print1();
	}
}
