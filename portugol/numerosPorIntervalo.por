programa
{
	
	funcao inicio()
	{
		inteiro numero, grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0
		
		escreva("Digite um número: ")
		leia(numero)

		enquanto (numero >= 0) {

			se (numero <= 25) {
				grupo1++
			} senao se (numero <= 50) {
				grupo2++
			} senao se (numero <= 75) {
				grupo3++
			} senao se (numero <= 100) {
				grupo4++
			}

			escreva("Digite um número: ")
			leia(numero)
		}

		escreva("\nA quantidade de números no intervalo [0-25] é " + grupo1)
		escreva("\nA quantidade de números no intervalo [26-50] é " + grupo2)
		escreva("\nA quantidade de números no intervalo [51-75] é " + grupo3)
		escreva("\nA quantidade de números no intervalo [76-100] é " + grupo4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */