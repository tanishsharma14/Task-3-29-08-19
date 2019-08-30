package ssi.task3;

public class Question4 {

	public static void main(String[] args) {
		
		String s="This is java and we like java";
		int count=0;
		int position=0;
		
		for(int i=0;i<s.length();i++)
		{
			position=s.indexOf("java",i);
			
			if(position!=-1)
			{
				count++;
				System.out.println("Java fount at index "+position+" "+count+"st time");
				i=position++;
				
			}
			
		}
		
		

	}

}
