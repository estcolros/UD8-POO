package Ejercicio1;

public class PersonaApp {
	

		public static void main(String[] args) {
	
			Persona p1 = new Persona("Estefania",26,'M');
			Persona p2 = new Persona("Anouar", 16, "4812181S", 'H',185, 50);
			Persona p3 = new Persona("David", 29, "4865055J", 'H', 175, 90);
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(p3.toString());
			

		}

	}
