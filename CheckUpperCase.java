package Strings;
import java.util.*;
public class CheckUpperCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s =input.next();
		
		boolean ideal = true;
		
		if(s.length()>1) {
			
			char c = s.charAt(0);
			
			if(Character.isUpperCase(c)) {
				
				int count = 0;
				for(int i=1;i<s.length();i++)
				{
					char c1 = s.charAt(i);
					if(Character.isLowerCase(c1)) {
						
						count++;
					}
				}
				if (count!=s.length()-1) {
					ideal = false;
					
				}
			}
				else {
					ideal = false;
				}
			}
			
			
			
			
		
		else {
			ideal = false;
		}
		
	
  System.out.println(ideal);
	}

}
