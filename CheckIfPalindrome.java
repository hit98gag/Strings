package Strings;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Adada";
		char a[] = s.toCharArray();
		String s1 = "";
		
		int i=0;
		
		int j = a.length-1;
		boolean flag = true;
		
		while(i<j) {
			
			if(a[i]!=a[j]) {
				
				flag = false;
				}
				i++;
				j--;
			
			
			
			
		}
		if(flag==false) {
		System.out.println("Not a pallindrome");
		}
		else {
			System.out.println("Pallindrome");
		}

	}

}
