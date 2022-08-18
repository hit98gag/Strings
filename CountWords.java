package PractiseQuestions;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Hello World world";
		int c=0;
		String []s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			
			c++;
		}
		System.out.println(c);
	}

}
