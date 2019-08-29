package reversing;

public class Reversone {

	public static void main(String[] args) {
		String R = reverse("The Best One of The World is to Care for The People ");
		System.out.println(R);
	}

	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		int madam1= 0;
		for (int i = s.length()-1; i >= 0; i--) {
			
			letters[madam1] = s.charAt(i);
			madam1 ++ ;
		}
		String reverse = "";
		for (int i = 0; i < s.length(); i ++) {
			reverse = reverse + letters[i];
		}
		return reverse;
	}

}
