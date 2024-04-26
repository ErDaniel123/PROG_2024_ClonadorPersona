package clonador;

import java.util.ArrayList;
import java.util.List;
import Personas.Persona;
import Personas.PersonaData;
import utilidades.FactoryPersona;

public class ClonadorPersona {

	private String nombre;
	private List<Persona> personas;

	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList();

	}

	@Override
	public String toString() {
		return "\nClonadorPersona [nombre=" + nombre + ", personas=" + personas + "]";
	}

	public List<Persona> generar()  {

		
		for (int i = 0; i < 10; i++) {
		try {
			Persona p;
			p = FactoryPersona.getPersona(nombre);
		
				personas.add(0,p);

			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		return personas;
	}

}
