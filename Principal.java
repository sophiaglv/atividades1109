package atividades1109;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo("Lobo mau", "Macho", "Lobo Vermelho");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		System.out.println("--------------------");

		Leao leao = new Leao("Zeke", "Macho", "Leão Branco");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();
		
		System.out.println("--------------------");
		
		Tigre tigre = new Tigre("Tigrão", "Macho", "Tigre Bengala");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();
		
		System.out.println("--------------------");
		
		Cachorro cachorro = new Cachorro("Dama", "Fêmea", "Cocker Spaniel");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("--------------------");
		
		Gato gato = new Gato("Tom", "Macho", "Azul Russo");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();
	}

}
