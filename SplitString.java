package Strings;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      

		String s = "Hello World Hello ";
		
		String [] a = s.split(" ");
		
for(int i=0; i<a.length;i++) {
	
	System.out.println(a[i]);
}		
	}

}
