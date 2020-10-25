package zoologico;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import animais.*;
import Index.Bio;

public class Zoologico {

	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	public static Animal animais[] = inicializarAnimais();
	public static byte animalIndice;
	public static int animalDistanciaAnterior;
	
	public static String distancia[] = {"", "", "", "", "", "", "", "", ""};
	
	public static void main(String[] args) throws InterruptedException {
		
		boolean voltar = true;
		
		do {
			
			imprimirLetreiro();
			animalIndice = menuPrincipal();
			
			if (animalIndice == 6) break;
			
			if (animalIndice == 5)
				Bio.main(args);
			else
				voltar = visitarAnimal();
			
		} while (voltar);
		
		scanner.close();
	}

	public static Animal[] inicializarAnimais() {
		Animal animais[] = new Animal[5];
		animais[0] = new Macaco("Macaco", "Jorginho", 13, 5.45);
		animais[1] = new Jacare("Jacaré", "Zé Jacaré", 34, 77.43);
		animais[2] = new Ema("Ema", "Arlequina", 21, 23.14);
		animais[3] = new Sapo("Sapo", "Caco", 8, 0.83);
		animais[4] = new Tubarao("Tubarão", "Bêibi Xarqui", 23, 1_241.23);
		return animais;
	}
	
	public static void imprimirLetreiro() {
		
		System.out.println(" _____                      _             _           ");
		System.out.println("/ _  / ___   ___           | | ___   __ _(_) ___ ___  ");
		System.out.println("\\// / / _ \\ / _ \\   _____  | |/ _ \\ / _` | |/ __/ _ \\ ");
		System.out.println(" / //\\ (_) | (_) | |_____| | | (_) | (_| | | (_| (_) |");
		System.out.println("/____/\\___/ \\___/          |_|\\___/ \\__, |_|\\___\\___/ ");
		System.out.println("                                    |___/            ");
		
	}
	
	public static byte menuPrincipal() {
		
		byte opcao;
		do {
			System.out.println("Para onde deseja ir?");
			System.out.println("1 - Visitar macaco");
			System.out.println("2 - Visitar jacaré");
			System.out.println("3 - Visitar ema");
			System.out.println("4 - Visitar sapo");
			System.out.println("5 - Visitar tubarão");
			System.out.println("6 - Biodex");
			System.out.println("7 - Ir embora");
			try {
				opcao = scanner.nextByte();				
			} catch (InputMismatchException e) {
				System.out.println("Input inválido");
				scanner.nextLine();
				opcao = 0;
			}
			
		} while (opcao < 1 || opcao > 7);
		
		
		//return (opcao == 7) ? 7 : --opcao;
		return --opcao;
	}
	
	public static boolean visitarAnimal() {
		
		String mensagem = "", dormiu = "";
		byte acao;
		boolean barulho = true;
		
		animalDistanciaAnterior = animais[animalIndice].getDistancia();
		limparTela();
		
		do {
			
			imprimirTela();
			System.out.println(mensagem + "\n");
			acao = menuAnimal();
			
			switch(acao) {
				case 1:
					mensagem = "Você: tó \n" + animais[animalIndice].getNome() + ": " + animais[animalIndice].comer(random.nextDouble());
					break;
				case 2:
					barulho = random.nextBoolean();
					if (barulho)
						mensagem = "Você: ô, bixinho! vem, vem! \n" + animais[animalIndice].getNome() + ": " + animais[animalIndice].movimentar("confusão");
					else
						mensagem = "Você: ô, bixinho! vem, vem! \n" + animais[animalIndice].getNome() + ": " + animais[animalIndice].movimentar("movimentação");
					break;
				case 3:
					mensagem = "Você: vem cá, " + animais[animalIndice].getNome() + "!\n" + animais[animalIndice].getNome() + ": " + animais[animalIndice].movimentar("atenção");
					break;
				case 4:
					limparTela();
					return true; //Visitar outro animal
				case 5:
					mensagem = "Zoo-lógico: Já estamos conversando com os criadores do Biodex!";
					break;
				case 6:
					mensagem = "Zoo-lógico: Processo de adoção indisponível. Estamos conversando com as criadoras do AUtonoMIA";
					break;
				case 7:
					limparTela();
					return false; //Ir embora
				case 8:
					mensagem = "Você: tó, cloroquina! \n" + animais[animalIndice].getNome() + ": " + animais[animalIndice].movimentar("jair");
					break;
			}
			
			dormiu = animais[animalIndice].dormir();
			mensagem = (dormiu.equals("")) ? mensagem : dormiu; 
			
			limparTela();

		} while (true);
		
	}
	
	public static void imprimirTela() {
		String imagem[] = animais[animalIndice].getImagem();
		int vezes;
		
		if (animalDistanciaAnterior < animais[animalIndice].getDistancia()) {
			vezes = animais[animalIndice].getDistancia() - animalDistanciaAnterior;
			for (int k = 0; k < vezes; k++, animalDistanciaAnterior++) {
				
				imprimirQuadro(imagem);
			}
		} else if (animalDistanciaAnterior > animais[animalIndice].getDistancia()){
			vezes = animalDistanciaAnterior - animais[animalIndice].getDistancia();
			for (int k = 0; k < vezes; k++, animalDistanciaAnterior--) {
				
				imprimirQuadro(imagem);
			}
		} else {
			for (int i = 0; i < imagem.length; i++) {
				for (int j = 0; j < animalDistanciaAnterior; j++) System.out.print(" ");
				System.out.print(imagem[i] + "\n");
			}
		}
		animalDistanciaAnterior = animais[animalIndice].getDistancia();
		
	}
	
	public static void imprimirQuadro(String imagem[]) {
		
		limparTela();
		for (int i = 0; i < imagem.length; i++) {
			for (int j = 0; j < animalDistanciaAnterior; j++) System.out.print(" ");
			System.out.print(imagem[i] + "\n");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static byte menuAnimal() {
		byte acao;
		do {
			System.out.println("Que que cê quer fazer?");
			System.out.println("1 - Oferecer comida");
			System.out.println("2 - Acenar");
			System.out.println("3 - Chamar pelo nome");
			System.out.println("4 - Visitar outro animal");
			System.out.println("5 - Acessar Biodex de " + animais[animalIndice].getTipo() + " (em breve!)");
			System.out.println("6 - Adotar " + animais[animalIndice].getNome() + " com o AUtonoMIA");
			System.out.println("7 - Ir embora");
			if (animais[animalIndice].getTipo().equals("Ema"))
				System.out.println("8 - Oferecer cloroquina");
				
			try {
				acao = scanner.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Input inválido");
				scanner.nextLine();
				acao = 0;
			}
			
			if (acao < 1 || acao > 8) {
				limparTela();
				imprimirTela();
				System.out.println("Zelador: ô maldade, não faz isso com o bixinho, não!");
			}
			
			if (!animais[animalIndice].getTipo().equals("Ema") && acao == 8)
				acao = 0;
			
		} while (acao < 1 || acao > 8);
		
		return acao;
	}
	
	public static void limparTela() {
		for (int i = 0; i < 40; i++) System.out.println();
	}
}
