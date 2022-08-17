package Strings;

public class IdealString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello world";
		char a[] = s.toCharArray();
         boolean flag = true;
		if (a[0] >= 97 && a[0] <= 122) {
			System.out.println("Not Ideal");
			return;
		}

		else {
			for (int i = 1; i < a.length; i++) {

				if (a[i] >= 65 && a[i] <= 90) {

                   flag = false;
				}

				
			}
		}
if (flag == false) {
	System.out.println("Non Ideal");
	
}
if (flag == true) {
	System.out.println(" Ideal");

}

	}
}