package Strings;
import java.util.*;
public class CountPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev="";
        String [] s1 = str.split(" ");

       int count=0;
        for(int i=s1.length-1; i>=0; i--){
           rev=rev+str.charAt(i);
            }
        if(rev.equals(s1)){
           count ++;
	}
        System.out.println(count);		

}
}