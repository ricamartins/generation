programa
{

	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos[10], maiorValor = 1, soma = 0, ocorrencias = 0

		para (inteiro i = 0; i < 10; i++) {
			lancamentos[i] = Util.sorteia(1, 6)
		}

		para (inteiro i = 0; i < 10; i++) {
			escreva("\nLançamento número " + (i + 1) + ": " + lancamentos[i])
			soma += lancamentos[i]
			se (lancamentos[i] > maiorValor) {
				maiorValor = lancamentos[i]
			}
		}

		para (inteiro i = 0; i < 10; i++) {
			se (lancamentos[i] == maiorValor) {
				ocorrencias++
			}
		}

		escreva("\nA média aritmética dos lançamentos é " + (soma / 10))
		escreva("\nO número de ocorrências do maior valor é " + ocorrencias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */