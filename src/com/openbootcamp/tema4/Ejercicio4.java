package com.openbootcamp.tema4;

public class Ejercicio4 {
	public static void main(String[] args) {
		SmartDevice motoC = new SmartPhone("Motorola", "tx???", true, 6.5f, true, 2, 4 );
		SmartDevice shaker = new SmartWatch("Shaker", "Flor de relos", false, 1.5f, true);
		
		System.out.println(motoC);
		System.out.println();
		System.out.println(shaker);
		
	}
}
