package Strings;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String s = input.nextLine(); // hello world;

		String s1[] = s.split(" "); // hello // world

		System.out.println(Arrays.toString(s1));

		for (int i = 0; i < s1.length; i++) {
			char a[] = s1[i].toCharArray(); //

			for (int j = a.length-1; j >= 0; j--) {

				System.out.print(a[j]);

			}
			System.out.print(" ");

		}

	}

}
