package Strings;

public class Pangram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A quick brown fox jumps over the lazy dog";
		int flag = 1;
		int freq[] = new int[26];
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				int index = ch - 'a';
				freq[index] = freq[index] + 1;
			}
		
		}
		
		boolean pangram = true;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == 0) {
				pangram = false;
				break;
			}
		}
		
		System.out.println(pangram);

	}

}
