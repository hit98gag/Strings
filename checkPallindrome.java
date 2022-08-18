package PractiseQuestions;

public class checkPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b =1221;
		int a=b;
		int rev=0;
		while(a!=0) {
			
			int rem = a%10;
			rev = rev*10+rem;
			a=a/10;
		}	
		

		if(b == rev)
		{
			System.out.println("ITs a Palindrome");
		}
		else {			System.out.println("Not a Palindrome");

			
		}
		
	}

}
