package practice;

public class Practice {
	
	public static void main(String[] args)
	{
		
		String s=" Hello world how are you";
		String rev="";
		
		String[] words=s.split(" "); 
		
		System.out.println(s);
		for(String w:words)
		{
			String revwords="";
			
		for(int i=w.length()-1;i>=0;i-- )
		{
			
			revwords=revwords+w.charAt(i);
		}
		rev=rev+revwords+" ";
		}
		System.out.println(rev);
	}

}
