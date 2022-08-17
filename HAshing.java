package Strings;

public class HAshing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abbacc";
		
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(!s1.contains(c+"")){
				s1+=c;
				
			}
			
		}
		System.out.println(s1);

	}

}
