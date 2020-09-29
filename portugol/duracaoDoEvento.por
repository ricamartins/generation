programa
{
	
	funcao inicio()
	{
		inteiro duracaoEmSegundos, horas, minutos, segundos

		escreva("Digite o tempo de duração do evento: ")
		leia(duracaoEmSegundos)

		horas = duracaoEmSegundos / 3600
		duracaoEmSegundos = duracaoEmSegundos % 3600

		minutos = duracaoEmSegundos / 60
		duracaoEmSegundos = duracaoEmSegundos % 60

		segundos = duracaoEmSegundos

		escreva("A duração do evento é de " + horas + "h" + minutos + "m" + segundos + "s")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 87; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */