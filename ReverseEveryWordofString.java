package Strings;

public class ReverseEveryWordofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I Love my India";
		
		String a[] = s.split(" ");
		
		String temp = "";
		
		for(int i=0;i<a.length;i++) {
			String val = a[i];
			
		}
		
		for(int j =val.length()-1;j>=0;j--) {
			rev = rev + val.charAt(j);
		}
		
		temp = temp + rev+" ";
		
	}
	}

}
