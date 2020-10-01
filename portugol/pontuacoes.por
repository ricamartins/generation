programa
{
	
	funcao inicio()
	{
		inteiro pontuacoes[5], maiorPontuacao = 0

		para (inteiro i = 0; i < 5; i++) {
			escreva("Digite a pontuação da atividade: ")
			leia(pontuacoes[i]) 
		}

		escreva("Pontuações:")
		para (inteiro i = 0; i < 5; i++) {
			escreva("\n", pontuacoes[i])
			se (pontuacoes[i] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[i]
			}
		}

		escreva("\nA maior pontuação foi " + maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */