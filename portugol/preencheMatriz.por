programa
{

	inclua biblioteca Util

	funcao preenche_matriz(inteiro matriz[][]) {
		para (inteiro i = 0; i < 3; i++) {
			para ( inteiro j = 0; j <3; j++) {
				matriz[i][j] = Util.sorteia(1, 10)
			}
		}
	}

	funcao escreve_matriz(inteiro matriz[][]) {
		para (inteiro i = 0; i < 3; i++) {
			para (inteiro j = 0; j < 3; j++) {
				escreva("[" + matriz[i][j] + "]")
			}
			escreva("\n")
		}
	}
	
	funcao inicio()
	{
		inteiro M1[3][3], M2[3][3]

		preenche_matriz(M1)
		preenche_matriz(M2)
		
		escreve_matriz(M1)
		escreve_matriz(M2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */