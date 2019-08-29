package oop;

public class Elevter {
	String color = "Black";
	String SHAP = "BOX";
	String Moving = "very Fast";
	int time = 5;
	static boolean movements = true;
	static boolean stopInFloor5 = false;

	public static void up() {
		movements = true;
	}

	public static void down() {
		movements = false;
	}

	public static void floor5() {
		stopInFloor5 = true;
	}

	public static void floor4() {
		stopInFloor5 = false;

	}

}
