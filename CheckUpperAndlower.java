package Strings;
import java.util.*;
public class CheckUpperAndlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       String s=sc.nextLine();
	       sc.close();
	       int capital=0;
	       int small=0;
	       for(int i=0; i< s.length(); i++)
	       {
	           if(s.charAt(i)==' ')
	           {
	               
	           }
	           else
	           {
	                 if(Character.isUpperCase(s.charAt(i)))
	                {
	                    capital++;
	                }
	                else
	                {
	                    small++;
	                }
	           }
	             
	        }
	          
	        System.out.println(capital);
	        System.out.println(small);
	       
	       }
	      
	
	}


