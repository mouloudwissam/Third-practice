package reversing;

public class ReversingMethod {
	public static void main(String[] args) {
		String word="MOUloud";
		
		StringBuilder stringBuilder =new StringBuilder(word);
		
	    String  reverseWord =new String (stringBuilder.reverse());
	
		System.out.println(word);
		System.out.println(reverseWord);
	}
}
