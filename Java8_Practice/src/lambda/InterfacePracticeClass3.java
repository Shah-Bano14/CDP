package lambda;

public class InterfacePracticeClass3 implements InterfacePractice1,InterfacePractice2 {

	public static void main(String args[])
	{
		InterfacePracticeClass3 i=new InterfacePracticeClass3();
		i.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		InterfacePractice2.super.m1();
	}

	
}
