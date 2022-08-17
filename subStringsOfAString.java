package Strings;

public class subStringsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcd";
		int count =0;
		for(int i = 0; i <a.length();i++) {
			for(int j =i; j <a.length();j++) {
				
		String sub = a.substring(i,j);
				System.out.println(sub);
				
				if(a.charAt(i) == a.charAt(j) ) {
					
					count ++;
					
				}
				
				}

		}
		
		System.out.println(count);

	}

}
