package Strings;
import java.util.*;
public class Reverse_a_StringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
		String[] a = s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
          
			 char[] c = a[i].toCharArray();
			 System.out.println(c);
			 for(int j=c.length-1;j>=0;j--)
		        {
		            System.out.print(c[j]);
		        }
		}
		 System.out.print(" ");

    }
	}


