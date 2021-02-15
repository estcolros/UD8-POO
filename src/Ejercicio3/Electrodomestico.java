package Ejercicio3;

public class Electrodomestico {
	
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	
	
	final double PRECIO_BASE_DEFAULT = 100;
	final String COLOR_DEFAULT = "blanco";
	final char CONSUMO_ENERGETICO_DEFAULT = 'F';
	final double PESO_DEFAULT = 5.0;
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}
	
	public Electrodomestico(double precio, double peso) {	
		this.precioBase = precio;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
	}	
	
	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		
		//Variable para comprobaciones
		boolean colorCorrecto = false;
		boolean consumoEnergeticoCorrecto = false;
		
		//Si no es un color permitido da un error
		if(color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
			colorCorrecto = true;
		}else {
			System.out.println("Introduce un color valido");
		}
		
		//Si no es un consumo energetico permitido da un error
		if(consumoEnergetico == 'A'|| consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			consumoEnergeticoCorrecto = true;
		}else {
			System.out.println("Introduce un consumo energetico valido");
		}
		
		//Comprueba que el color y el consumo sean correctors
		if(colorCorrecto && consumoEnergeticoCorrecto) {
			this.precioBase = precio;
			this.color = color;
			this.consumoEnergetico = consumoEnergetico;
			this.peso = peso;
		}
		
	}

	
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
