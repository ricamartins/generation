programa
{
	
	funcao inicio()
	{
		inteiro vetor[3], matriz[3][3], resultado[3][3]
		
		para(inteiro i = 0; i < 3; i++) {
			escreva("Digite o valor para a posição " + (i + 1) + " do vetor: ")
			leia(vetor[i])
		}

		para(inteiro i = 0; i < 3; i++) {
			para(inteiro j = 0; j < 3; j++) {
				escreva("Digite o valor para a posição " + (i + 1) + "/" + (j + 1) + " da matriz: ")
				leia(matriz[i][j])
			}
		}

		para(inteiro j = 0; j < 3; j++) {
			para(inteiro i = 0; i < 3; i++) {
				resultado[i][j] = vetor[i] * matriz[i][j]
			}
		}

		para(inteiro i = 0; i < 3; i++) {
			para(inteiro j = 0; j < 3; j++) {
				escreva("[" + resultado[i][j] + "]")
			}
			escreva("\n")
		}
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