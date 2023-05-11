package preubas;

public class Fuente extends Colores {

	String negrita, tachado, subrayado;

	public Fuente() {
		super();
		negrita = "\033[1m";
		tachado = "\033[9m";
		subrayado = "\033[4m";
	}
	
	// Esta heredando de la Clase Color por eso tiene color
	public String getFuente(String color) {
	    return tachado + color + "Texto en tachado" + reset + " (Herencia de color)";
	}
}

