package ssi.task3;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		
		String city[]={"Indore","Bhopal","Dewas","Ashoknagar"};
		
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<city.length-1-i;j++)
			{
				if(city[j].compareTo(city[j+1])>0)
				{
					String temp=city[j];
					city[j]=city[j+1];
					city[j+1]=temp;
				}
			}
		}
		
		System.out.println("Cities in ascending order are");
		
		for(String s:city)
			System.out.println(s);

	}

}
