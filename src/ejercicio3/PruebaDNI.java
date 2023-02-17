package ejercicio3;

public class PruebaDNI {

	public static void main(String[] args) {

		DNI miDNI = new DNI("00243917N");
		if (miDNI.esCorrecto()) {
			System.out.println("ES CORRECTO " + miDNI.getValue());
		}
		
		miDNI.setValue("00243917W");
		if (miDNI.esCorrecto()) {
			System.out.println("ES CORRECTO " + miDNI.getValue());
		}

	}

}
