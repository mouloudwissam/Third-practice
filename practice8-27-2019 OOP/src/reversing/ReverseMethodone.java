package reversing;

public class ReverseMethodone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bestWord = " mouloud ";
		
		StringBuilder stringBuilder = new StringBuilder(bestWord);
		
		String reverseBestWord = new String(stringBuilder.reverse());
		
		System.out.println(reverseBestWord);
		System.out.println(reverseBestWord.toLowerCase());
		
		System.out.println(bestWord);
		
		System.out.println(reverseBestWord.charAt(4));
		
		System.out.println(reverseBestWord.replace("m", "C"));
	}

}
