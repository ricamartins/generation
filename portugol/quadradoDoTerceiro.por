programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, num3, num4
		
		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		se (mat.potencia(num3, 2) >= 1000) {
			escreva("\nO terceiro número é " + num3 + " e seu quadrado é " + mat.potencia(num3, 2))
		} senao {
			escreva("\nO primeiro número é " + num1 + " e seu quadrado é " + mat.potencia(num1, 2))
			escreva("\nO segundo número é " + num2 + " e seu quadrado é " + mat.potencia(num2, 2))
			escreva("\nO terceiro número é " + num3 + " e seu quadrado é " + mat.potencia(num3, 2))
			escreva("\nO quarto número é " + num4 + " e seu quadrado é " + mat.potencia(num4, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */