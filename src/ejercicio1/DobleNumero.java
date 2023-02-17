package ejercicio1;

public class DobleNumero {
	// Atributo privado que representa el número a mostrar el doble
	private int num;

	// Constructor que inicializa el atributo con un valor inicial
	public DobleNumero(int num) {
		this.num = num;
	}

	// Método setter para cambiar el valor del número
	public void setValue(int num) {
		this.num = num;
	}

	// Método getter para consultar el valor del número multiplicado por 2
	public int getValue() {
		return 2 * num;
	}
}
