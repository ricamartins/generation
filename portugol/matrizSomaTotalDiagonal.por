programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], somaTotal = 0, somaDiagonal = 0

		para (inteiro i = 0; i < 3; i++) {
			para (inteiro j = 0; j < 3; j++) {
				escreva("Digite o valor da posição " + (i + 1) + "/" + (j + 1) + ": ")
				leia(matriz[i][j])
			}
		}

		para (inteiro i = 0; i < 3; i++) {
			para (inteiro j = 0; j < 3; j++) {
				somaTotal += matriz[i][j]
				se (i == j) {
					somaDiagonal += matriz[i][j]
				}
			}
		}

		escreva("\nA soma de todos os valores da matriz é " + somaTotal)
		escreva("\nA soma de todos os valores da diagonal principal da matriz é " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */