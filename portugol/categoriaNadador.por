programa
{
	
	funcao inicio()
	{
		inteiro idade
		
		escreva("Digite sua idade: ")
		leia(idade)

		se (idade >= 18) {
			escreva("Sua categoria é: Adulto")
		} senao se (idade >= 14) {
			escreva("Sua categoria é: Juvenil B")
		} senao se (idade >= 12) {
			escreva("Sua categoria é: Juvenil A")
		}senao se (idade >= 8) {
			escreva("Sua categoria é: Infantil B")
		} senao se (idade >= 5) {
			escreva("Sua categoria é: Infantil A")
		} senao {
			escreva("Você não tem categoria definida ainda")
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