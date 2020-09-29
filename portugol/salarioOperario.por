programa
{
	
	funcao inicio()
	{
		cadeia codigo
		real horasTrabalhadas, salarioExcedente = 0.0, salarioBase = 500.0, salarioTotal
		
		escreva("Digite seu código: ")
		leia(codigo)
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(horasTrabalhadas)

		se (horasTrabalhadas > 50) {
			salarioExcedente = (horasTrabalhadas - 50) * 20.0
		}

		salarioTotal = salarioExcedente + salarioBase
		escreva("O operário de código: " + codigo + " tem um salário total de R$ " + salarioTotal + " e um salário excedente de R$ " + salarioExcedente)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */