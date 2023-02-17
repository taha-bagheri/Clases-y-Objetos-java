package ejercicio2;

public class Primo {
	// Atributo privado que indica el número a calcular si es primo
	private int num;

	// Constructor que inicializa el atributo con un valor inicial
	public Primo(int num) {
		this.num = num;
	}

	// Método setter para cambiar el valor del número
	public void setValue(int num) {
		this.num = num;
	}

	// Método getter para consultar el valor del número
	public int getValue() {
		return num;
	}

	// Método para determinar si el número es primo o no
	public boolean esPrimo() {
		// Los números menores a 2 no son primos
		if (num < 2) {
			return false;
		}

		// Recorre los números desde 2 hasta num-1 para buscar un divisor
		for (int i = 2; i < num; i++) {
			// Si num es divisible por i, entonces no es primo
			if (num % i == 0) {
				return false;
			}
		}

		// Si no se encontró ningún divisor, entonces el número es primo
		return true;
	}
}
