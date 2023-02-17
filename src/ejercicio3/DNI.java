package ejercicio3;

public class DNI {
	private String nif;

	// Constructor que inicializa el valor del atributo nif
	public DNI(String nif) {
		this.nif = nif;
	}

	// Método para cambiar el valor del atributo nif
	public void setValue(String nif) {
		this.nif = nif;
	}

	// Método para obtener el valor del atributo nif
	public String getValue() {
		return nif;
	}

	// Método que comprueba si el DNI es válido
	public boolean esCorrecto() {
		// Comprobar que el NIF tiene 9 caracteres
		if (nif.length() != 9) {
			return false;
		}

		// Comprobar que los 8 primeros caracteres son dígitos numéricos
		String numeros = nif.substring(0, 8);
		for (int i = 0; i < numeros.length(); i++) {
			if (!Character.isDigit(numeros.charAt(i))) {
				return false;
			}
		}

		// Comprobar que el último caracter es una letra
		char letra = nif.charAt(8);
		if (!Character.isLetter(letra)) {
			return false;
		}

		// Calcular la letra correspondiente a los números del DNI
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numerosDNI = Integer.parseInt(numeros);
		int resto = numerosDNI % 23;
		char letraCalculada = letras.charAt(resto);

		// Comprobar que la letra del DNI es correcta
		return letra == letraCalculada;
	}
}
