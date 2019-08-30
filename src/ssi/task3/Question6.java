package ssi.task3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		
		String input=sc.next();
		
		StringBuffer bf=new StringBuffer(input);
		bf.reverse();
		
		if(input.equals(bf.toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
