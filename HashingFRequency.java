package PractiseQuestions;
import java.util.*;
public class HashingFRequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		s = s.toLowerCase();
		int a[] = new int[26];
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			int index = ch -'a';
			a[index] = a[index]+1;
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>0) {
			
			int z =97+i;
			System.out.println("Freq at "+ (char)z + " is : " + a[i] );

			}
		}
		
		
	}

}
