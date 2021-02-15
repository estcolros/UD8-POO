package Ejercicio1;

public class Persona {

	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
		
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "5149537S";
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	//Getters & Setters
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}
	
}
