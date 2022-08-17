package Strings;

public class RotatedStringisPallindromeORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="nitin";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			
			char a[] = s.toCharArray();
			
			rev = rev+s.charAt(i);
		}
			if(rev.equals(s)) {
				
				System.out.println("Pallindrome");
			}
			else {
				System.out.println("Not");
			}
			
		

	}

}
