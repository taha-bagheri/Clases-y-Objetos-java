package ejercicio4;

public class CuentaCorriente {
	private String saldo;

	// Constructor sin parámetros que pone el saldo a "0"
	public CuentaCorriente() {
		this.saldo = "0";
	}

	// Método getter para obtener el saldo como un entero
	public int getSaldo() {
		return Integer.parseInt(saldo);
	}

	// Método para realizar una imposición (ingreso de dinero)
	public void imposicion(int x) {
		// Sumar el valor de x al saldo actual
		int saldoActual = Integer.parseInt(saldo); // Convertir saldo a entero
		saldoActual += x;
		saldo = Integer.toString(saldoActual); // Convertir saldo a cadena de caracteres
	}

	// Método para realizar un reintegro (sacar dinero)
	public void reintegro(int x) {
		// Restar el valor de x al saldo actual
		int saldoActual = Integer.parseInt(saldo); // Convertir saldo a entero
		saldoActual -= x;
		saldo = Integer.toString(saldoActual); // Convertir saldo a cadena de caracteres
	}
}
