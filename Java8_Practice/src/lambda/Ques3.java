package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import lambdaIntefaces.Ques3Interface;

public class Ques3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the strings");
		String s2 = sc.next();
		String s3 = sc.next();

		//System.out.println("hello");

		boolean flag = checkForValidString(s2, s3);
		if(flag==false)
		{
			System.out.println("not valid");
			return;
		}
		//System.out.println(flag + "valid for checking rotation");

		Ques3Interface p1 = new Ques3Interface() {

			@Override
			public String rotation(String s, String s1) {
				char ch1[] = new char[s.length()];
				char ch2[] = s1.toCharArray();
				int d = 0;
				if (s.equals(s1))
					return "yes";
				for (int i = 1; i <= s.length(); i++) {
					// left rotation
					for (int j = 0; j < s.length(); j++) {
						d = j - i;
						if (d < 0)
							d = s.length() + d;
						//System.out.println("d and j are "+d+ " "+j+ "for character "+s.charAt(j));
						ch1[d] = s.charAt(j);
					}
					if (Arrays.equals(ch1, ch2))
						return "yes";
					// right rotation
					for (int j = 0; j < s.length(); j++) {
						d = j + i;
						if (d > s.length() - 1)
							d = d - s.length();
						ch1[d] = s.charAt(j);
					}
					if (Arrays.equals(ch1, ch2))
						return "yes";
				}

				return "no";
			}

		};
		System.out.println(p1.rotation(s2,s3)+ "previous is the rotation of other");
		
		Ques3Interface p2=(s,s1)->{
			char ch1[] = new char[s.length()];
			char ch2[] = s1.toCharArray();
			int d = 0;
			if (s.equals(s1))
				return "yes";
			for (int i = 1; i <= s.length(); i++) {
				// left rotation
				for (int j = 0; j < s.length(); j++) {
					d = j - i;
					if (d < 0)
						d = s.length() + d;
					//System.out.println("d and j are "+d+ " "+j+ "for character "+s.charAt(j));
					ch1[d] = s.charAt(j);
				}
				if (Arrays.equals(ch1, ch2))
					return "yes";
				// right rotation
				for (int j = 0; j < s.length(); j++) {
					d = j + i;
					if (d > s.length() - 1)
						d = d - s.length();
					ch1[d] = s.charAt(j);
				}
				if (Arrays.equals(ch1, ch2))
					return "yes";
			}

			return "no";
			
		};
		System.out.println(p1.rotation(s2,s3)+ "previous is the rotation of other using lambda expressions");
	}

	public static boolean checkForValidString(String s, String s1) {
		if (s.length() == s1.length()) {
			HashMap<Character, Integer> hm1 = new HashMap<>();
			HashMap<Character, Integer> hm2 = new HashMap<>();
			char ch1[] = s.toCharArray();
			char ch2[] = s1.toCharArray();
			for (char ch : ch1) {
				if (hm1.containsKey(ch))
					hm1.put(ch, hm1.get(ch) + 1);
				else
					hm1.put(ch, 1);
			}
			for (char ch : ch2) {
				if (hm2.containsKey(ch))
					hm2.put(ch, hm2.get(ch) + 1);
				else
					hm2.put(ch, 1);
			}
			for (Map.Entry m : hm1.entrySet()) {
				if (hm2.containsKey(m.getKey())) {
					if (hm2.get(m.getKey()) == m.getValue() == false) {
						return false;
					}
				} else
					return false;
			}
			return true;

		} else {
			return false;
		}
	}

}
