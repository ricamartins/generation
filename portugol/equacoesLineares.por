programa
{
	
	funcao inicio()
	{
		real A, B, C, D, E, F, X, Y
		
		escreva("Digite o valor do coeficiente a: ")
		leia(A)

		escreva("Digite o valor do coeficiente b: ")
		leia(B)

		escreva("Digite o valor do coeficiente c: ")
		leia(C)

		escreva("Digite o valor do coeficiente d: ")
		leia(D)

		escreva("Digite o valor do coeficiente e: ")
		leia(E)

		escreva("Digite o valor do coeficiente f: ")
		leia(F)

		X = ((C * E) - (B * F)) / ((A * E) - (B * D))
		Y = ((A * F) - (C * D)) / ((A * E) - (B * D))

		escreva("O valor de X é " + X + " e o valor de Y é " + Y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */