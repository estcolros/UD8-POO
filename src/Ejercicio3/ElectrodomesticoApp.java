package Ejercicio3;

public class ElectrodomesticoApp {
	public static void main(String[] args) {
		
	//Introducimos los valores 	
	Electrodomestico elect1= new Electrodomestico();
	Electrodomestico elect2 = new Electrodomestico(150, 20);
	Electrodomestico elect3 = new Electrodomestico(50, "rojo", 'E', 24);
	
	//Imprime cada electrodomestico con los valores asignados
	System.out.println(elect1.toString());
	System.out.println(elect2.toString());
	System.out.println(elect3.toString());
	
	}
}
