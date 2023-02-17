package ejercicio1;

public class PruebaDobleNumero {

	public static void main(String[] args) {

		DobleNumero miNumero = new DobleNumero(1);
		System.out.println(miNumero.getValue()); // Imprime 2

		miNumero.setValue(8);
		System.out.println(miNumero.getValue()); // Imprime 16

	}

}
