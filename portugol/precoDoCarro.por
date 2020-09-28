programa
{
	
	funcao inicio()
	{
		real custoFabrica, valorDistribuidor, impostos, valorFinal
		
		escreva("Informe o custo de fábrica: ")
		leia(custoFabrica)

		valorDistribuidor = custoFabrica * 0.28
		impostos = custoFabrica * 0.45

		valorFinal = custoFabrica + valorDistribuidor + impostos

		escreva("O preço final do carro para o consumidor é de R$ " + valorFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */