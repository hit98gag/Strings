package Strings;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		
		char a[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i));
		}
	}

}
