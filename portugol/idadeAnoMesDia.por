programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro idadeEmDias, dias, meses, anos
		escreva("Qual sua idade em dias?: ")
		leia(idadeEmDias)

		anos = idadeEmDias / 365
		idadeEmDias = idadeEmDias % 365
		
		meses = idadeEmDias / 30
		idadeEmDias = idadeEmDias % 30

		dias = idadeEmDias
		
		escreva("Sua idade é " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */