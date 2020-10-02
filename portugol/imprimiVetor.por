programa
{
	
	funcao inicio()
	{
		real vetor[5]
		inteiro opcao

		para(inteiro i = 0; i < 5; i++) {
			escreva("Digite o valor para a posiçao " + (i + 1) + ":")
			leia(vetor[i])
		}

		faca {
			escreva("\nDigite uma opção: ")
			escreva("\n0 para sair")
			escreva("\n1 para imprimir o vetor em ordem direta")
			escreva("\n2 para imprimir o vetor em ordem inversa\n")
			leia(opcao)

			escolha (opcao) {
				caso 0:
					pare
				caso 1:
					escreva("[  ")
					para(inteiro i = 0; i < 5; i++) {
						escreva(vetor[i] + "  ")
					}
					escreva("]")
					pare
				caso 2:
					escreva("\n[  ")
					para(inteiro i = 4; i >= 0; i--) {
						escreva(vetor[i] + "  ")
					}
					escreva("]\n")
					pare
				caso contrario:
					escreva("\nComando inválido. Digite novamente")
					
			}
			
		} enquanto (opcao != 0)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */