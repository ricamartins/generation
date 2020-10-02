programa
{
	
	funcao inicio()
	{
		real precoEtiqueta
		inteiro opcao

		escreva("Digite o preço do produto: ")
		leia(precoEtiqueta)

		escreva("\nDigite o número para forma de pagamento: ")
		escreva("\n(1) À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n(2) À vista no cartão de crédito, recebe 15% de desconto ")
		escreva("\n(3) Em duas vezes, preço normal de etiqueta sem juros")
		escreva("\n(4) Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		leia(opcao)

		escolha (opcao) {

			caso 1:
				escreva("\nÚnico pagamento, em dinheiro ou cheque, no valor de R$ " + (precoEtiqueta * 0.8))
				pare
			caso 2:
				escreva("\nÚnico pagamento, no cartão de crédito, no valor de R$ " + (precoEtiqueta * 0.85))
				pare
			caso 3:
				escreva("\nDois pagamentos no valor de R$ " + (precoEtiqueta / 2))
				pare
			caso 4:
				escreva("\nTrês pagamentos no valor de R$ " + ((precoEtiqueta * 1.1) / 3))
				pare
			caso contrario:
				escreva("\nForma de pagamento inválida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */