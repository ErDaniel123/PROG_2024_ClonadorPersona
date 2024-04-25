package clonador;

import java.util.ArrayList;
import java.util.List;
import Personas.Persona;

public class ClonadorPersona {

	private String nombre;
	private List<Persona> personas;

	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList();
		generar();
	}

	@Override
	public String toString() {
		return "\nClonadorPersona [nombre=" + nombre + ", personas=" + personas + "]";
	}

	public List<Persona> generar() {

		for (int i = 0; i < 10; i++) {

			Persona p;
			p = new Persona(nombre, (int) (Math.random() * 101), (int) (Math.random() * 201),
					(int) (Math.random() * 100));
			personas.add(p);
		}

		return personas;

	}
}
