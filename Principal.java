package abstrato;

public class Principal {

	public static void main(String[] args) {
		Carro ferrari = new Carro("00000", "F1", "Vermelho", 2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();

		System.out.println("--------------------");

		Onibus marcopolo = new Onibus("11111", "XB1", "Prata", 2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();

		System.out.println("--------------------");

		Carro onix = new Carro("22222", "LT", "Prata", 2021);
		onix.ligar();
		onix.acelerar();
		onix.virar();
		onix.frear();

		System.out.println("--------------------");

		Moto honda = new Moto("33333", "NXR", "Preta", 2024);
		honda.ligar();
		honda.acelerar();
		honda.virar();
		honda.frear();
	}

}
