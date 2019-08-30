package ssi.task3;

public class Question8 {

	public static void main(String[] args) {
		 String s="India,Australia,England,America";
		 
		 StringBuilder sb=new StringBuilder();
		 
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!=',')
			 {
				 sb.append(s.charAt(i));
			 }
			 else
			 {
				 System.out.println(sb);
				 sb=new StringBuilder();
			 }
		 }
		 System.out.println(sb);

	}

}
