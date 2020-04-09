package lambda;

public class threadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //anonymous ineer class with method
		Thread t=new Thread(new Runnable()
				{
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("child thread "+ i +" "+ Thread.currentThread().getId());
				}
			}
				});
		t.start();
		// with lambda expression
		Thread t1= new Thread(()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread from runnable"+ i +" "+Thread.currentThread().getId());
			}
		});
		t1.start();
		
	}

}
