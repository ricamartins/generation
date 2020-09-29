programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número inteiro: ")
		leia(numero)

		se ((numero % 2) == 0) {
			se (numero > 0) {
				escreva("O número é positivo e é par")
			} senao se (numero < 0) {
				escreva("O número é negativo e é par")
			} senao {
				escreva("O número é 0 (zero)")
			}
		} senao {
			se (numero > 0) {
				escreva("O número é positivo e é ímpar")
			} senao se (numero < 0) {
				escreva("O número é negativo e é ímpar")
			} senao {
				escreva("O número é 0 (zero)")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */