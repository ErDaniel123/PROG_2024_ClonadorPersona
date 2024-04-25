package Personas;

public class Persona {

	private String nombre;
	private int edad;
	private int peso;
	private int altura;

	public Persona(String nombre, int edad, int peso, int altura) {

		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
		this.edad = edad;

	}

	@Override
	public String toString() {
		return "\nPersona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
	}

	{

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
