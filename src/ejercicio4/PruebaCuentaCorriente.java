package ejercicio4;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {

		CuentaCorriente cuenta = new CuentaCorriente();
		cuenta.imposicion(200);
		cuenta.reintegro(300);
		System.out.println(cuenta.getSaldo());
	}

}
