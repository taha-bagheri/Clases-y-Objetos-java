package ejercicio5;

public class Coche {
	private int ruedas;
	private int velocidad;

	// Constructor sin parámetros
	public Coche() {
		this.ruedas = 4;
		this.velocidad = 0;
	}

	// Métodos getter y setter para los atributos
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// Método para acelerar el coche
	public void acelerar(int cantidad) {
		if (this.velocidad + cantidad <= 120) { // Comprobamos que no se sobrepase la velocidad máxima
			this.velocidad += cantidad;
		}
	}

	// Método para frenar el coche
	public void frenar(int cantidad) {
		if (this.velocidad - cantidad >= 0) { // Comprobamos que no se quede la velocidad en valores negativos
			this.velocidad -= cantidad;
		}
	}

	// Método para mostrar todos los atributos del objeto
	@Override
	public String toString() {
		return "Coche{" + "ruedas=" + ruedas + ", velocidad=" + velocidad + '}';
	}
}
