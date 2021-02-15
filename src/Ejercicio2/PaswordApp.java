package Ejercicio2;

public class PaswordApp {
	public static void main(String[] args) {

		Password p1 = new Password();
		System.out.println("La longitud de la contraseña es de " + p1.longitud + " caracteres\n"
				+ "Contraseña generada: " + p1.contraseña);

		Password p2 = new Password();
		System.out.println("La longitud de la contraseña es de " + p2.longitud + " caracteres\n"
				+ "Contraseña generada: " + p2.contraseña);

	}

}
