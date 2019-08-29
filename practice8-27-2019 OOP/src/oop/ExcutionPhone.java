package oop;

import java.awt.Color;

public class ExcutionPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		System.out.println(phone.Color);
		
		System.out.println(phone.Number);
		
		System.out.println(phone.Screen);
		
		System.out.println(phone.Type);
		
		Phone.volumeUp();
		System.out.println(phone.volume);
		
		phone.volumedown();
		System.out.println(phone.volume);
		
		phone.turnOn();
		System.out.println(phone.power);
		
		phone.turnOff();
		System.out.println(phone.power);

	}

}
