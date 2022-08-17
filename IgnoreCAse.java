package Strings;

public class IgnoreCAse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s ="Hello";
	String s1 = "";
	
	//System.out.println(s.equals(s1));
	//System.out.println(s.equalsIgnoreCase(s1));

for(int i=s.length()-1;i>=0;i--) {
	s1 = s1+s.charAt(i);

}
if(s1.equalsIgnoreCase(s)) {
	System.out.println("Pallindrome");
}
else {
	System.out.println("Not a Pallindrome");
}

}
	

}
