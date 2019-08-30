package ssi.task3;

import java.util.StringTokenizer;

public class Question10 {

	public static void main(String[] args) {
	  
		 String s="1.Java 2.Phthon 3.Oracle";
		 
		 StringTokenizer tok=new StringTokenizer(s,"123456789. ");
		 
		 while(tok.hasMoreTokens())
			 System.out.println(tok.nextElement());

	}

}
