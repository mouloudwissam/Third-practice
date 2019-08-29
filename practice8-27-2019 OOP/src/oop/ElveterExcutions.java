package oop;

public class ElveterExcutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevter elevter = new Elevter();
		elevter.floor4();
		System.out.println(elevter.stopInFloor5);
		System.out.println(elevter.color);
		System.out.println(elevter.SHAP);
		elevter.down();
		System.out.println(elevter.movements);
		System.out.println(elevter.time);
		System.out.println(elevter.Moving);

		elevter.up();
		System.out.println(elevter.movements);
		elevter.floor5();
		System.out.println(elevter.stopInFloor5);
	}

}
