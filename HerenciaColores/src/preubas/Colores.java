package preubas;

public class Colores {

	String rojo;
	String verde;
	String azul;
	String reset;

	public Colores() {
		super();
		rojo = "\u001B[31m";
		verde = "\u001B[32m";
		azul = "\u001B[34m";
		reset = "\u001B[0m";
	}
	// esta herendado de la clase Fuente, por eso esta subrayado
	public String getColores(String fuente) {
		return rojo + fuente +"Color rojo "+ reset+ " (Herencia de Fuente)" ;
		
	}
	
}
