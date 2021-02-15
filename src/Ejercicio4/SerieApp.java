package Ejercicio4;

public class SerieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie s1 = new Serie();
		Serie s2 = new Serie("Dark", "Baran bo Odar");
		Serie s3 = new Serie("Vikings", 6, false, "Drama histórico Acción-Aventura", "Michael Hirst");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}

}
