package PractiseQuestions;
import java.util.*;
public class ReverseTargetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome to World Of Programming";
		String target = "Welcome";
		
		String[] a = s.split(" ");
		
		String temp= "";
		
		for(int i=0;i<a.length;i++) {
			String val = a[i];
			
			if(val.equals(target)) {
				String rev ="";
				
				for(int j =val.length()-1;j>=0;j--) {
					
					rev = rev+val.charAt(j);
				}
				temp = temp + rev + " ";
				
			}
			
			else {
				
				temp =temp +val+" ";
			}
			
			 
		}
		System.out.println(temp + " ");
		

	}

}
