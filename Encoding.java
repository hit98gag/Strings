package Strings;
import java.util.*;
public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		String str=sc.nextLine();
		sc.close();
		String temp=str.charAt(0)+"";
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			char ch1=str.charAt(i+1);
			
			if(ch==ch1)
			{
				count++;
			}
			else
			{  
				temp=temp+count+ch1;
				count=1;
			}
		}
		temp=temp+count;
		System.out.println(temp);

	}



	}


