programa
{
	
	funcao inicio()
	{
		inteiro somaTotal = 0, quantidadeValores = 0, valor = 1
		
		enquanto (valor > 0) {
			
			escreva("Digite um valor: ")
			leia(valor)
			
			se (valor > 0) {
				somaTotal += valor
				quantidadeValores++ 
			} senao {
				pare
			}

			limpa()
		}

		escreva("\nA soma total foi de " + somaTotal)
		escreva("\nA quantidade de valores inseridos foi de " + quantidadeValores)
		escreva("\nA média dos valores é " + (somaTotal / quantidadeValores))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */