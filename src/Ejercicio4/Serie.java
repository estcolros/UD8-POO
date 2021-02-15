package Ejercicio4;

public class Serie {
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	private final int NUMTEMPORADAS_DEF=3;
	private final boolean ENTREGADO_DEF=false;
	
	

	public Serie() {
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	
	
	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumTemporadas() {
		return numTemporadas;
	}


	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public int getNUMTEMPORADAS_DEF() {
		return NUMTEMPORADAS_DEF;
	}


	public boolean isENTREGADO_DEF() {
		return ENTREGADO_DEF;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
}