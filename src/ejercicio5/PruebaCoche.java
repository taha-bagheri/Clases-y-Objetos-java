package ejercicio5;

public class PruebaCoche {

	public static void main(String[] args) {

		Coche mini = new Coche();
		Coche porche = new Coche();
		mini.setVelocidad(70);
		mini.acelerar(20);
		mini.acelerar(40);
		porche.setVelocidad(120);
		porche.frenar(90);
		porche.frenar(40);
		System.out.println(mini);
		System.out.println(porche);
	}

}
