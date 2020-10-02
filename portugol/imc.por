programa
{
	
	funcao inicio()
	{
		real peso, altura, imc
		
		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso / altura / altura

		se (imc < 18.5) {
			escreva("\nVocê está abaixo do peso, pois seu IMC é " + imc)
		} senao se (imc < 25) {
			escreva("\nVocê está no peso normal, pois seu IMC é " + imc)
		} senao se (imc < 30) {
			escreva("\nVocê está acima do peso, pois seu IMC é " + imc)
		} senao {
			escreva("\nVocê está obeso, pois seu IMC é " + imc)
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