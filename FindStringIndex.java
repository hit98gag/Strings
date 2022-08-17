package Strings;

import java.util.Arrays;

public class FindStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "We are in class, we are great";
		String s2= "we";


		s=s.toLowerCase();
		
        String []s1 = s.split(" ");
        
        System.out.println(Arrays.toString(s1));
        
        int count = 0;
        for (int i = 0; i < s1.length; i++)
        {
        // if match found increase count
        if (s1[i].equals(s2)) {
            count++;
        }
     

	}		
		
        System.out.println(count);

		
	}
}

