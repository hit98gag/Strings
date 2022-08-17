package Strings;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Programming";
		s=s.toLowerCase();
		
		int temp[] = new int [26];
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
         int ind = ch - 'a';
         
         temp[ind] = temp[ind] +1;
         
		
        		 
		if(temp[ind] > 1) {
			
			System.out.println("Duplicate elements are : " +ch  );
		}
		}
		
		

		

	}
	}	

	


