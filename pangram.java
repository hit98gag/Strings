package Strings;
import java.util.*;
public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
boolean flag = true;
		for(char ch='a';ch<='z';ch++) {
			
			if(!s.contains(ch+"")) {
				flag=false;
			
			}
}
		System.out.println(flag);

}
}