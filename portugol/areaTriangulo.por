programa
{
	
	funcao inicio()
	{
		real base, altura
		
		escreva("Digite o valor da base do triângulo: ")
		leia(base)
		escreva("Digite o valor da altura do triângulo: ")
		leia(altura)

		se (base > 0 e altura > 0) {
			escreva("A área do triângulo é de " + (base * altura / 2))
		} senao {
			escreva("Valores inválidos para base e/ou altura")
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