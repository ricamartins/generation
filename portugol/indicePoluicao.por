programa
{
	
	funcao inicio()
	{
		real indicePoluicao, NIVEL1 = 0.3, NIVEL2 = 0.4, NIVEL3 = 0.5
		
		escreva("Digite o índice de poluição: ")
		leia(indicePoluicao)

		se (indicePoluicao >= NIVEL3) {
			escreva("Enviando notificações para todas as empresas para paralizarem suas atividades")
		} senao se (indicePoluicao >= NIVEL2) {
			escreva("Enviando intimações para as empresas do grupo 1 e 2 para suspenderem suas atividades")
		} senao se (indicePoluicao >= NIVEL1) {
			escreva("Enviando intimações para as empresas do grupo 1 para suspenderem suas atividades")
		} senao {
			escreva("Índice de poluição aceitável")
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