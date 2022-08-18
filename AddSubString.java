package Strings_16thAug;

import java.util.*;

public class AddSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String s1 = s.substring(i, j + 1);
				System.out.println(s1);
				int x =  Integer.parseInt(s1);
				sum = sum + x;
			}
		}
		System.out.println(sum);
	}

}
