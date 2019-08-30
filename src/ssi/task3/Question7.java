package ssi.task3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string with characters,digit and special characters");
		String input=sc.next();
		
		int character=0,digit=0,special_character=0;
		for(int i=0;i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
				digit++;
			else if(Character.isLetter(input.charAt(i)))
				character++;
			else
				special_character++;
			
		}
		
		
		System.out.println("Character in the input String are:"+character);
		System.out.println("Digit in the input String are:"+digit);
		System.out.println("Special Character in the input Strng are:"+special_character);

	}

}
