programa
{
	inclua biblioteca Util
	funcao pularLinha()
	{
		escreva("\n")
	}
	
	funcao inicio()
	{
		cadeia lista[] = {"Bruna dos Santos",
		"Bruno Correia da Costa",
		"Bruno de Freitas Sousa",
		"Carla Cristina Conceição de Paula",
		"Christian Garcia Amantino",
		"Cleiton Ortega dos Santos",
		"Debora Miranda Carmona",
		"Everton Luiz Rosário de Oliveira",
		"Gabriel Reis Ritter",
		"Gildenor Junior da Silva Costa",
		"Guilherme Marcionilo Pedroso do Rosario Silva",
		"Herick Willians Canhete Rocha",
		"Jacqueline Alves Barbosa",
		"João Victor dos Santos Rigoleto",
		"Jonas De Oliveira Santos",
		"Jonathan Cavalcanti De Paula",
		"Juliana Cavalaro de Oliveira",
		"Karina Soares Lima",
		"Larissa Meira Dominguez",
		"Leonardo Iamur Terra",
		"Lysandro Andrade Martin",
		"Matheus Araujo de moraes",
		"Matheus Fernandes Rodrigues",
		"Matheus Trindade Torok",
		"Mônica dos santos ribeiro",
		"Natália Lopes moreno",
		"Phelipe Almeida de Souza",
		"Rafaela de Albuquerque",
		"Ricardo Martins Corrêa",
		"Sarah Lidia De Oliveira Braia",
		"Stefanie Dias Costa",
		"Tiago Diniz Gomes",		
		"Victor Augusto de Souza Tavares",
		"Vivian Rodrigues Nakano",
		"Washington pereira dos santos",
		"Wellington Vieira","Wesley Bueno da Silva",
		"Yago Tonoli Domingues",
		"Zaine de Queiros Jesus"}

		const inteiro  LIMITE = 39
		inteiro x = 0
		inteiro grupo = 1
		inteiro grupoUsuario = 0
		inteiro mat [LIMITE]
		caracter resposta 
		inteiro contador = 0
		inteiro pessoas = 0
		inteiro randomiza [LIMITE]
		logico teste = verdadeiro
		inteiro y = 0
		inteiro contRandom = 0
		inteiro imprima = 0
		
		para (x = 0; x < LIMITE; x++)
		{
			randomiza[x] = x+100
		}
		para (x = 0; x <LIMITE; x++)
		{
			
			faca{
				randomiza [x] = Util.sorteia(0, 38)
				teste = verdadeiro
				contRandom = 0
				para (y = 0; y < LIMITE; y++)
				{
					se (randomiza [y] == randomiza [x])
					
					{
						contRandom++
						se(contRandom >1)
						{
							teste = falso
						}
					}
				}
				
			} enquanto (teste == falso)
			//escreva ("[ ",randomiza [x]," ]")	// imprime o log do vetor random	
			
		}
		pularLinha()

		para (x = 0; x < LIMITE; x++)
		{
			mat[x] = x+1
		}
		escreva ("Matricula\t   Alunx	 " )
		pularLinha()
		para (x = 0; x < LIMITE; x++)
		{
			escreva("   ",mat[x],"\t\t",lista[x])
			pularLinha()
				
		}

		
		escreva ("quer separar em grupos  sim'S', para o programa nao'N'")
		leia (resposta)

		se (resposta == 'S' ou resposta == 's')
		{
			limpa()
			faca
				{
				escreva ("O numero de pessoas por para ser divido")
				leia(pessoas)				
				se (LIMITE%pessoas == 0)
				{
					grupoUsuario = LIMITE/pessoas
				}senao
				{
					grupoUsuario = (LIMITE/pessoas)+1
				}
				//escreva ("\n ",grupoUsuario,"\n")  // log de grupos
				} enquanto (grupoUsuario > (LIMITE/2)+1)
			para (x = 0 ; x < LIMITE; x+=pessoas)
			{
				para ( y = 0; y < pessoas;y++)
				{
					se (contador < LIMITE){
						imprima = randomiza[contador]
						escreva ("matricula:",imprima+1,"\tgrupo : ",grupo,"\t Alunx: ",lista[imprima])
						contador++
						pularLinha()
					}						
				}
				grupo++
				pularLinha()
			}		
	
		}
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */