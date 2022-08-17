package Strings;

import java.util.Arrays;

public class CheckIfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "abcde";
		
		s1=s1.toLowerCase();
		s2 =s2.toLowerCase();
		
		char a[] = s1.toCharArray();
		char b [] = s2.toCharArray();
	     
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean flag = false;
		
		if(s1.length()!=s2.length()) {
			
			flag = false;
		}
		
		else {
			for(int i=0;i<a.length;i++) {
				
				if( a[i] != b[i]) {
					flag = false;
				}
				
				
		}
			
			
			
		}
		System.out.println(flag);

	}

}
