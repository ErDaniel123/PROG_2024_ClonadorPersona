package main;

import clonador.ClonadorPersona;

public class Start {

	public static void main(String[] args) {

		ClonadorPersona c = new ClonadorPersona("Paco");
		System.out.println(c.generar());
	}

}
