package Strings;

public class CheckIfAlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello123";
		
		int w=0;
		int n=0;
		
       for (int i=0;i<s.length();i++) {
    	   
    	   char s1 = s.charAt(i);
    	   
    	   if(s1>= 'A' || s1<='Z' && s1>='a' || s1<='z' ) {
    		   w++;
    	   }
    	   else if(s1>0||s1<9) {
    		   
    		   
    		   n++;
    	   }
       }
       System.out.println(n +"," + w);
	}

}
