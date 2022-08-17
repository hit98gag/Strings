package Strings;
import java.util.*;
public class CharA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
	      char ch='7';
	      if(Character.isUpperCase(ch)){
	        System.out.println("Uppercase");
	      }else if(Character.isLowerCase(ch)){
	        System.out.println("LowerCase");
	      }else if(Character.isDigit(ch)){
	        System.out.println("Digit");
	      }else{
	        System.out.println("Special Character");
	      }
	}

}
