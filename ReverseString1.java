package Strings;

import java.util.*;
import java.util.Arrays;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";

		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {

			char[] c = a[i].toCharArray();
			
			//System.out.println(c);
			
			for (int j = c.length - 1; j >= 0; j--) {

				//System.out.print(c[j]);
			}
//System.out.print(" ");
		}
	}

}
