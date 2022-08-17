package Strings;

public class CheckSubStringIfPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Today mam taught us meem";
		
		s= s.toLowerCase();
		
		String [] a= s.split(" ");
		
		int count =0;
		
		for(int i=0;i<a.length;i++) 
		{
			String word = a[i];
			
			String temp = "";
			
		for(int j=word.length()-1;j>=0;j--) {
			
			temp = temp+word.charAt(j);
			
		}
		if(temp.equals(word)) {
			count++;
		}
		
		
		}
		
		System.out.println(count);

	}

}
