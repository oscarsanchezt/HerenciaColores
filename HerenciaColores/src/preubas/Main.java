package preubas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colores color = new Colores();
		Fuente fuente = new Fuente();
		
		// para la clase color un subrayado
		System.out.println(color.getColores(fuente.subrayado));
		// para la clase fuente un color verde
		System.out.println(fuente.getFuente(color.verde));
	}
}
