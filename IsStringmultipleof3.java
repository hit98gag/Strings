package Strings;

public class IsStringmultipleof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello Worldi";
		String s1 = "Fuck Off";
		
		s= s.toUpperCase();
		boolean flag = true;
		
		for(int i =0; i<s.length();i++) {
			
			if(s.length()%3!=0) {
				flag = false;
				
			}
			
			
			
			
		}
		System.out.println(s.concat(s1));
		System.out.println(flag);
		System.out.println(s);

	}

}
