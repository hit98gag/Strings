package Strings;

public class CountFrequencyofWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="welcome to the world of programming world";
		String s1 = "world";
		
		String a[] = s.split(" ");
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			
			
			if(s1.equals(a[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
