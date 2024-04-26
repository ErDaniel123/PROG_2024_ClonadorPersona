package utilidades;

import java.util.LinkedList;

import Personas.Persona;
import Personas.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) throws Exception  {
		LinkedList<Persona> personas = new LinkedList<Persona>();
		Persona p;

		p = new Persona(nombre, (int) (Math.random() * 100), (int) (Math.random() * 101), (int) (Math.random() * 200));
		
		if (p.getAltura() <= PersonaData.ALTURA_MAXIMA & p.getEdad() <= PersonaData.EDAD_MAXIMA
				& p.getPeso() <= PersonaData.PESO_MAXIMO) {
			personas.add(p);
		}
		else throw new Exception("Datos no validos");

		return p;

	}
}