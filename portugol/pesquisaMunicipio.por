programa
{
	
	funcao inicio()
	{
		real salario, salarioTotal = 0.0, maiorSalario = 0.0, filhosTotal = 0.0, salarioAte100 = 0.0
		inteiro habitantes = 20, filhos
		
		para (inteiro i = habitantes; i > 0; i--) {
			
			escreva("Digite seu salário: ")
			leia(salario)
			escreva("Digite quantos filhos você tem: ")
			leia(filhos)

			salarioTotal += salario
			filhosTotal += filhos

			se (salario > maiorSalario) {
				maiorSalario = salario
			}

			se (salario <= 100) {
				salarioAte100++
			}

			limpa()
		}

		escreva("\nA média salarial é de R$ " + (salarioTotal / habitantes))
		escreva("\nA média de filhos é de " + (filhosTotal / habitantes) + " filhos por pessoa")
		escreva("\nO maior salário é de R$ " + maiorSalario)
		escreva("\nO percentual de pessoas com salário menor ou igual a R$ 100 é de " + (salarioAte100 / habitantes * 100) + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */