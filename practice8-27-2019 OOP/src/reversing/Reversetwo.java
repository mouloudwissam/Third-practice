package reversing;

public class Reversetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String henry = "The Best Time is when i am with my friends";

		StringBuilder stringBuilder = new StringBuilder(henry);

		String henryreverse = new String(stringBuilder.reverse());

		System.out.println(henry);

		System.out.println(henryreverse);
		
		System.out.println(henryreverse.toCharArray());

	}

}
