package MainJogo;



import java.util.Random;
import java.util.Scanner;

import jogoTorre.D20;
import jogoTorre.Monstros;
import jogoTorre.PlayerBasic;


public class TorreInfinta {
	
	static boolean searchSaida = false;
	static Scanner leia = new Scanner (System.in);
	static D20 d20 = new D20();
	static PlayerBasic player = new PlayerBasic("boludo");
	static int[] saidaPG =new int [2];
	static Random gerador = new Random();
	static Monstros mon = new Monstros(1);
	static private boolean chave = false;
	private static int torreNivel = 1;
	private static boolean saida = false;
	private static boolean monster = false;
	public static void main (String ars[]) throws InterruptedException {
		
		System.out.println("Bem vindo a Torre dos pesadelos");
		imprimirTorre();
		System.out.println("Digite o seu Nome");
		player.criando(1);
		player.setNome(leia.next());
		player.status();
		player.expUp(300); //para teste
		
		
		int menuP;
		while (true) {
			if(saida ) break;
			if (player.vida() == false) {
				System.out.println("GAME OVER");
				System.out.println("Adeus caro competidor, seu record foi \n Player nivel: "+player.getNivel()+"\n Andar :"+torreNivel);
				imprimirSaida();
				break;
			}
			imprimirAndar();
			player.checagem();
			while (true) {
				System.out.println("Voce esta no Menu Principal, andar: "+torreNivel);
				System.out.println("Digite 1 - Procurar nos Arredores");
				System.out.println("Digite 2 - Para Subir de andar");
				System.out.println("Digite 3 - Status Jogador");
				System.out.println("Digite 4 - Sair do Jogo");
				menuP = leia.nextInt();
				
				if (menuP>0 && menuP <5) break;
			}
			
			switch (menuP) {
				case 1:
					monster = false;
					search();
					int menuS = 0;
					mon = new Monstros(torreNivel);
					if(monster) {
						while(searchSaida = true)
						{
							//player.checagem();
							mon.checarVida();
							if (mon.vida() == false) {
								player.expUp(mon.getExp());
								System.out.println("O monstro Faleceu, Baus encontrados:"+mon.getRaridade());
								imprimirVitoria();								
								for (int i =0; i <mon.getRaridade();i++) {
									abrirBau();	
									if(chave == false) {
										int chance = d20.jogarDado();
										if(chance>18) {
											chave = true;
											System.out.println("A chave do andar foi encontrada");
											imprimirChave();
											Thread.sleep(2000);
										}
									}
								}
								
								
								break;
							}
							
							if (player.vida() == false)break;
							//player.status();
							imprimirMonstros();
							mon.status();
							
							while (true) {
								System.out.println("Menu de Combate");
								System.out.println("1 - Para ataque padrão");
								System.out.println("2 - Para ataque magico");
								System.out.println("3 - Para usar poção");
								System.out.println("4 - Para ver o status");
								menuS = leia.nextInt();
								if (menuS>0 && menuS <5) break;
							}
							limpaTela();
							switch (menuS) {
								case 1:
									if (mon.getAgi()>player.getAgi()) {
										System.out.println("o Monstro esta atacando");
										imprimeMonstroAtaca();
										player.dano(mon.ataque());
										Thread.sleep(1000);
										//player.checagem();										
										if(player.vida() == false) break;
										else {
											limpaTela();
											System.out.println("O Player esta atacando");
											imprimePlayerAtaca();
											mon.dano(player.ataque());
										}
										
									} else {
										System.out.println("O Player esta atacando");
										imprimePlayerAtaca();
										mon.dano(player.ataque());
										
										mon.checarVida();
										
										Thread.sleep(1000);
										if(mon.vida() == false) {
											//System.out.println("Monstro Morreu");
											break;
										}
										else {
											limpaTela();
											System.out.println("o Monstro esta atacando");
											imprimeMonstroAtaca();
											player.dano(mon.ataque());
										}
										
									}
									player.checagem();
									Thread.sleep(1000);
									limpaTela();
								
									break;
								case 2:	
									if (player.magiaPossivel()) {
										if (mon.getAgi()>player.getAgi()) {
											System.out.println("o Monstro esta atacando");
											imprimeMonstroAtaca();
											player.dano(mon.ataque());											
											Thread.sleep(1000);
											//player.checagem();
											if(player.vida()  == false) break;
											else {
												limpaTela();
												System.out.println("O Player esta atacando");
												imprimePlayerAtaca();
												mon.dano(player.magia());
											}
											
										} else 
										{
											System.out.println("O Player esta atacando");
											imprimePlayerAtaca();
											mon.dano(player.magia());
											Thread.sleep(1000);
											mon.checarVida();
											if(mon.vida()  == false) break;
											else
											{
												limpaTela();
												System.out.println("o Monstro esta atacando");
												imprimeMonstroAtaca();
												player.dano(mon.ataque());
											}
											
										}
									}
									player.checagem();
									Thread.sleep(1000);
									limpaTela();
									
									break;
									
								case 3 :
									player.status();
									System.out.println("digite o numero de poções que vai usar\n cada poção cura 5 de hp");
									player.curarPotion(leia.nextInt());
									Thread.sleep(1000);
									limpaTela();
									
									break;
									
								case 4 :
									player.status();
									Thread.sleep(3000);
									//limpaTela();
									break;
									
							
							}
						}
					
					}
					Thread.sleep(1000);
					limpaTela();
				break;
				
				case 2 :
					if (chave) {
						System.out.println("A porta do proximo andar se abre \n cotinue em frente");
						Thread.sleep(1000);
						torreNivel++;
						System.out.println("Andar " +torreNivel);
						chave = false;
						Thread.sleep(1000);
						limpaTela();
					} else {
						System.out.println("VocÃª ainda nao encontrou a chave, Continue Procurando :)");
						Thread.sleep(1000);
						limpaTela();
					}
				
					break;
					
				case 3 :
					player.status();
					Thread.sleep(4000);
					limpaTela();
					break;
					
				case 4 :
					saida = true;
					System.out.println("Adeus caro competidor, seu record foi \n Player nivel: "+player.getNivel()+"\n Andar :"+torreNivel);
					imprimirSaida();
					break;
				
			}
		}
		
	}
	public static void limpaTela () {
		for (int i =0;i<50;i++ ) {
			System.out.println();
		}
	}
	
	
	public static void abrirBau() throws InterruptedException{
		System.out.println("Abrindo o Bau");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		int valor = d20.jogarDado();
		
		if (valor <7) {
			 // nada
			System.out.println("Os itens estão destruidos pelo tempo .-. ");
		} else if (valor <12) {
			 // potion
			System.out.printf("Poções: %d foram econtradas!!!\n",(valor-5));
			imprimirPotion();
			player.potionAdd(valor-5);
		} else 
		{
			 // pedra
			System.out.println("Algo estÃ¡ brilhando no bau!!!!");
			imprimirPedra();
			int valor2 = d20.jogarDado();
			pedrasGerador();
			if (valor2 <7) {
				 // nada
				System.out.println("uma pedra incomum foi encontrada  ");
				System.out.println((saidaPG[0])==1? "Pedra da foram":(saidaPG[0])==2? "Pedra Vitalidade" : (saidaPG[0])==3? "Pedra Defesa":(saidaPG[0])==4? "Pedra Magia":"Pedra da Agilidade" );
				saidaPG[1] = torreNivel*2;
				System.out.println("pedra poder de :"+saidaPG[1]);
			} else if (valor2 <18) {
				 // potion
				System.out.println("uma pedra Rara foi encontrada");
				System.out.println((saidaPG[0])==1? "Pedra da foram":(saidaPG[0])==2? "Pedra Vitalidade" : (saidaPG[0])==3? "Pedra Defesa":(saidaPG[0])==4? "Pedra Magia":"Pedra da Agilidade" );
				saidaPG[1] = torreNivel*4;
				System.out.println("pedra poder de :"+saidaPG[1]);
			} else  {
				System.out.println("Uma Pedra Super Rara Foi encontrada");
				System.out.println((saidaPG[0])==1? "Pedra da foram":(saidaPG[0])==2? "Pedra Vitalidade" : (saidaPG[0])==3? "Pedra Defesa":(saidaPG[0])==4? "Pedra Magia":"Pedra da Agilidade" );
				saidaPG[1] = torreNivel*6;
				System.out.println("pedra poder de :"+saidaPG[1]);
			}
			player.upPedra(saidaPG[0], saidaPG[1]);
		} 
	Thread.sleep(1000);	
	}
	public static void pedrasGerador () {
		int valor =gerador.nextInt(5)+1;
		System.out.println("Dado pedra:" +valor);
		switch (valor) {
		case 1:
			saidaPG[0] = 1;
			
			
			break;
		case 2:
			saidaPG [0] = 2;
			
			
			break;
		case 3:
			saidaPG [0] = 3;
			
			break;
		case 4:
			saidaPG [0] = 4;
			
			break;
		case 5:
			saidaPG [0] = 5;
			
			break;			
		}
	}
	
	public static void search() throws InterruptedException {
		System.out.println("Procurando");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.print(".");
		int valor = d20.jogarDado();
		searchSaida = false;
		
		if (valor <5) {
			 // nada
			System.out.println("Nada foi encontrado .-. ");
		} else if (valor <13) {
			searchSaida = true; // monstro
			System.out.println("Um monstro te encontrou durante a busca!!!");
			//imprimirMonstros();
			monster  = true;
		} else if (valor <19) 
		{
			// bau
			System.out.println("Um bau foi encontrado!!!!");
			imprimirBau();
			abrirBau();
		} else 
		{
			// chave encontrada
			chave  = true;
			System.out.println("Achou a chave do andar, proximo andar disponivel!!!!");
			imprimirChave();
		}
	}
	
	public static void imprimirChave() throws InterruptedException {
		System.out.println("──▄▀▀▀▄───────────────\r\n"
				+ "──█───█───────────────\r\n"
				+ "─███████─────────▄▀▀▄─\r\n"
				+ "░██─▀─██░░█▀█▀▀▀▀█░░█░\r\n"
				+ "░███▄███░░▀░▀░░░░░▀▀░░\r\n"
				+ "");
		Thread.sleep(1000);
		
	}
	public static void imprimirVitoria() {
		System.out.println("░▄░█░░░▄▀▀▀▀▀▄░░░█░▄░\r\n"
				+ "▄▄▀▄░░░█─▀─▀─█░░░▄▀▄▄\r\n"
				+ "░░░░▀▄▒▒▒▒▒▒▒▒▒▄▀░░░░\r\n"
				+ "░░░░░█────▀────█░░░░░\r\n"
				+ "░░░░░█────▀────█░░░░░\r\n"
				+ "");
		
	}
	public static void imprimirMonstros() {
		System.out.println("▒▒▒▒▒▒▐███████▌\r\n"
				+ "▒▒▒▒▒▒▐░▀░▀░▀░▌\r\n"
				+ "▒▒▒▒▒▒▐▄▄▄▄▄▄▄▌\r\n"
				+ "▄▀▀▀█▒▐░▀▀▄▀▀░▌▒█▀▀▀▄\r\n"
				+ "▌▌▌▌▐▒▄▌░▄▄▄░▐▄▒▌▐▐▐▐\r\n"
				+ "");
		
	}

	public static void imprimirBau() {
		System.out.println("█▄████─█▄████─█▄████");
		System.out.println("▀▀─▄█▀─▀▀─▄█▀─▀▀─▄█▀");
		System.out.println("──▄██────▄██────▄██");
		System.out.println("─▄██▀───▄██▀───▄██▀");
		System.out.println("─███────███────███");
		
	}
	
	public static void imprimirPotion() {
		System.out.println("──────▄▀─");
		System.out.println("─█▀▀▀█▀█─");
		System.out.println("──▀▄░▄▀──");
		System.out.println("────█────");
		System.out.println("──▄▄█▄▄──");		
	
	}
	
	public static void imprimirPedra() {
		System.out.println("♪♫──█▀▄───────♪♫");
		System.out.println("♪♫──█║║▀▄─────♪♫");
		System.out.println("♪♫──█║║║║▀▄───♪♫");
		System.out.println("♪♫──█║║║║║║█──♪♫");
		System.out.println("♪♫──█║║║║║▄▀──♪♫");
		System.out.println("♪♫──▀▀██▀▀────♪♫");
		
	}
	
	public static void imprimirSaida() {
		System.out.println("───▄█▌─▄─▄─▐█▄\r\n"
				+ "───██▌▀▀▄▀▀▐██\r\n"
				+ "───██▌─▄▄▄─▐██\r\n"
				+ "───▀██▌▐█▌▐██▀\r\n"
				+ "▄██████─▀─██████▄");
		
	}
	
	public static void imprimirTorre() {
		System.out.println("─────────█▄██▄█\r\n"
				+ "─────────▐█┼██▌─────────\r\n"
				+ "─────────▐████▌─────────\r\n"
				+ "─────────▐████▌─────────\r\n"
				+ "█▄█▄█▄█▄█▐█┼██▌█▄█▄█▄█▄█\r\n"
				+ "███┼█████▐████▌█████┼███\r\n"
				+ "█████████▐████▌█████████\r\n"
				+ "");
		
	}
	
	public static void imprimirAndar() {
		System.out.printf("─────────▐█████▌─────────\r\n"
					+ "──────────▐█%d█▌─────────\r\n"
					+ "─────────▐█████▌─────────\r\n",torreNivel);
		
	}
	
	public static void imprimeMonstroAtaca() {
		System.out.println("──▄█▀█▄─────────██\r\n"
				+ "▄████████▄───▄▀█▄▄▄▄\r\n"
				+ "██▀▼▼▼▼▼─▄▀──█▄▄\r\n"
				+ "█████▄▲▲▲─▄▄▄▀───▀▄\r\n"
				+ "██████▀▀▀▀─▀────────▀▀\r\n"
				+ "");
		
	}
	
	public static void imprimePlayerAtaca() {
		System.out.println("───────────────▄▄───▐█\r\n"
				+ "───▄▄▄───▄██▄──█▀───█─▄\r\n"
				+ "─▄██▀█▌─██▄▄──▐█▀▄─▐█▀\r\n"
				+ "▐█▀▀▌───▄▀▌─▌─█─▌──▌─▌\r\n"
				+ "▌▀▄─▐──▀▄─▐▄─▐▄▐▄─▐▄─▐▄\r\n"
				+ "");
		
	}
}
