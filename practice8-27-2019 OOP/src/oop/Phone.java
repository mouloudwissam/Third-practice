package oop;

public class Phone {
	String Color = "Grey";
	String Type = "I phone 6 plus";
	String Screen = "While";
	int Number = 9;
	static boolean power = false;
	static int volume = 0;

	public static void turnOn() {
		power = true;
	}

	public static void turnOff() {
		power = false;
	}

	public static void volumeUp() {
		volume++;
	}

	public static void volumedown() {
		volume--;
	}

}
