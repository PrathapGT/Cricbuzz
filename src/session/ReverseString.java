package session;

import java.util.Scanner;

public class ReverseString {

	public static void reversestring1(char []ch,int length) {
		
		
		if(length>0) {
			
			System.out.println(ch [length-1]);
			
			length--;
			reversestring1(ch,length);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string value");
		
		String str=sc.next();
		
		char[] ch=str.toCharArray();
		
		int length=ch.length;
		
		reversestring1(ch,length);
	}

}
