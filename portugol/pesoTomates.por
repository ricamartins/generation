programa
{
	
	funcao inicio()
	{
		real peso, excesso = 0.0, multa = 0.0
		inteiro LIMITE = 50
		
		escreva("Digite o peso de tomates em kg: ")
		leia(peso)

		se (peso > LIMITE) {
			excesso = peso - LIMITE
			multa = excesso * 4.0
		}

		escreva("O excesso de tomates foi de " + excesso + "kg e a multa foi de R$ " + multa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */