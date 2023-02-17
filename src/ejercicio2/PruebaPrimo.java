package ejercicio2;

public class PruebaPrimo {

	public static void main(String[] args) {

		Primo miNumero = new Primo(1);

		if (miNumero.esPrimo()) {
			System.out.println("ES PRIMO " + miNumero.getValue());
		}
		miNumero.setValue(5);

		if (miNumero.esPrimo()) {
			System.out.println("ES PRIMO " + miNumero.getValue());
		}
		miNumero.setValue(8);

		if (miNumero.esPrimo()) {
			System.out.println("ES PRIMO " + miNumero.getValue());
		}
		miNumero.setValue(11);

		if (miNumero.esPrimo()) {
			System.out.println("ES PRIMO " + miNumero.getValue());
		}

	}

}
