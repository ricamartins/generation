package lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static int pegaDados(int[][][] pessoas, int faixaEtaria, int genero, int personalidade) {
		
		int total = 0;
		
		int faixaEtariaINICIO = (faixaEtaria == -1) ? 0 : faixaEtaria;
		int generoINICIO = (genero == -1) ? 0 : genero;
		int personalidadeINICIO =(personalidade == -1) ? 0 : personalidade;
		
		int faixaEtariaFIM = (faixaEtaria == -1) ? 2 : faixaEtaria;
		int generoFIM = (genero == -1) ? 2 : genero;
		int personalidadeFIM = (personalidade == -1) ? 2 : personalidade;
		
		for (int i = faixaEtariaINICIO; i <= faixaEtariaFIM; i++) {
			for (int j = generoINICIO; j <= generoFIM; j++) {
				for (int k = personalidadeINICIO; k <= personalidadeFIM; k++) {
					total += pessoas[i][j][k];
				}
			}
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int LIMITE = 150;
		int idade, faixaEtaria, genero, personalidade;
		int[][][] pessoas = new int[3][3][3];
		
		//150
		int i = 0; while (i < LIMITE) {
			
			System.out.println("Informe a idade");
			idade = scanner.nextInt();
			faixaEtaria = (idade < 21) ? 0 : (idade < 40) ? 1 : 2; // 0 para menores de 21, 1 para entre 21 e 40, 2 para maiores de 40
			
			System.out.println("Escolha o g�nero");
			System.out.println("1 para Masculino\n2 para Feminino\n3 para Outro");
			genero = scanner.nextInt() - 1; //converter para indice
			
			System.out.println("Escolha a personalidade");
			System.out.println("1 para Calma\n2 para Nervosa\n3 para Agressiva");
			personalidade = scanner.nextInt() - 1; //converter para indice
			
			pessoas[faixaEtaria][genero][personalidade]++;
			
			i++;
		}
		
		//passe para pegaDados os valores de faixa et�ria, g�nero e personalidade nesta ordem
		//-1 para pegar todos os grupos de uma determinada caracter�stica,
		//ou os �ndices (0, 1 ou 2) para escolher um grupo espec�fico de uma caracter�stica
		System.out.println("O n�mero de pessoas calmas �: " + pegaDados(pessoas, -1, -1, 0));
		System.out.println("O n�mero de mulheres nervosas �: " + pegaDados(pessoas, -1, 1, 1));
		System.out.println("O n�mero de homens agressivos �: " + pegaDados(pessoas, -1, 0, 2));
		System.out.println("O n�mero de outros calmos �: " + pegaDados(pessoas, -1, 2, 0));
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + pegaDados(pessoas, 2, -1, 1));
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + pegaDados(pessoas, 0, -1, 0));

		scanner.close();
		
		/* VERS�O SEM MATRIZ
		 * 		
		 * Scanner scanner = new Scanner(System.in);
		int idade, personalidade, genero;
		int calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosasMaior40 = 0, calmasMenor18 = 0;
		
		//150
		for (int i = 0; i < 6; i ++) {
			
			System.out.println("Informe a idade");
			idade = scanner.nextInt();
			
			System.out.println("Escolha o g�nero");
			System.out.println("1 para Masculino\n2 para Feminino\n3 para Outro");
			genero = scanner.nextInt();
			
			System.out.println("Escolha a personalidade");
			System.out.println("1 para Calma\n2 para Nervosa\n3 para Agressiva");
			personalidade = scanner.nextInt();
			
			System.out.println("");
			
			calmas += (personalidade == 1) ? 1 : 0;
			mulheresNervosas += (personalidade == 2 && genero == 2) ? 1 : 0;
			homensAgressivos += (personalidade == 3 && genero == 1) ? 1 : 0;
			outrosCalmos += (personalidade == 1 && genero == 3) ? 1 : 0;
			nervosasMaior40 += (personalidade == 2 && idade > 40) ? 1 : 0;
			calmasMenor18 += (personalidade == 1 && idade < 18) ? 1 : 0;
		}
		
		System.out.println("O n�mero de pessoas calmas �: " + calmas); 
		System.out.println("O n�mero de mulheres nervosas �: " + mulheresNervosas);
		System.out.println("O n�mero de homens agressivos �: " + homensAgressivos);
		System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + nervosasMaior40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + calmasMenor18);

			scanner.close();
		 */
	}
}
