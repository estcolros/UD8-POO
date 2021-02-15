package Ejercicio2;

public class Password {

	int longitud;
	String contraseña;

	public Password() {
		this.longitud = 8;
		this.contraseña = generarContraseña(8);
	}

	public static String generarContraseña(int longitud) {

		String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";

		StringBuilder contraseña = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			int abc = (int) (letrasNumeros.length() * Math.random());
			contraseña.append(letrasNumeros.charAt(abc));
		}

		return contraseña.toString();
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
