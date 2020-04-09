package lambda;

import lambdaIntefaces.PalindromeInterface;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeInterface l1= new PalindromeInterface(){
	//without lambda expression		
			@Override
			public String string_Para(String s) {
				StringBuilder sb= new StringBuilder();
				sb.append(s);
				sb.reverse();
				return String.valueOf(sb);
			}
			
		};
		
		//with lambda expression
		
		PalindromeInterface l2= (s)-> {
			StringBuilder sb= new StringBuilder();
			sb.append(s);
			sb.reverse();
			return String.valueOf(sb);
		};
				
		//verification		
				
		if(l1.string_Para("madam").equals("madam"))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		
	if(l2.string_Para("madam").equals("madam"))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	}

}
