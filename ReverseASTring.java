package Strings;

public class ReverseASTring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My Name is Hitesh";
		
		String [] a = s.split(" ");
		
		String s1 = "";
		
		for(int i=a.length-1;i>=0;i--) {
			
			
			System.out.print(a[i] + " ");
		}
	}

}
