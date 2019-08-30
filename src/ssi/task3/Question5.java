package ssi.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Plese enter input ");
		String input=sc.next();
		
		char arr[]=new char[input.length()];
		int k=0;
		for(int i=input.length()-1;i>=0;i--)
		{
			arr[k++]=input.charAt(i);
		}
		
		boolean flag=true;
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!=arr[i])
					flag=false;
		}

		if(flag==true)
				System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
