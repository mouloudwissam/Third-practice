package oop;

public class Ball {
	String shape = "Circle";
	String colorofBall = "Orange";
	String matireal = "plastic ";
	int NumbeOfCircleOnIt = 25;
	String typeof[] = { "soft", "Hash", "verysoft " };
	static boolean thrwit = true;
	static boolean kick = false;

	public static void ThrowAway() {
		thrwit = true;
	}

	public static void throwUp() {
		thrwit = false;
	}

	public static void kickedaway() {
		kick = true;
	}

	public static void kickedslowly() {
		kick = false;

	}

}
