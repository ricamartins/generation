programa
{
	inclua biblioteca Util

	funcao cria_matriculas(inteiro mat[], inteiro LIMITE) {
		para (inteiro x = 0; x < LIMITE; x++) {
				mat[x] = x+1
		}
	}

	funcao retira_aluno(inteiro indice, cadeia alunos[], inteiro mat[], inteiro limite) {
		para(inteiro i = indice; i < limite; i++) {
			mat[i] = mat[i + 1]
			alunos[i] = alunos[i + 1]
		}
	}

	funcao copia_matriculas(inteiro mat[], inteiro matAux[], inteiro LIMITE) {
		para(inteiro i = 0; i < LIMITE; i++) {
			matAux[i] = mat[i]	
		}
	}
	
	funcao copia_alunos(cadeia alunos[], cadeia alunosAux[], inteiro LIMITE) {
		para(inteiro i = 0; i < LIMITE; i++) {
			alunosAux[i] = alunos[i]	
		}
	}
	
	funcao inicio()
	{
		//declarando os vetores
		const inteiro LIMITE = 39
		inteiro limite = LIMITE - 1
		cadeia alunos[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira", "Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		cadeia alunosAux[LIMITE]
		inteiro mat[LIMITE], matAux[LIMITE]
		inteiro alunosPorGrupo = 0, contador = 0, grupo = 0, sorteado

		cria_matriculas(mat, LIMITE)

		copia_matriculas(mat, matAux, LIMITE)
		copia_alunos(alunos, alunosAux, LIMITE)
		
		escreva("Digite a quantidade de alunos por grupo: ")
		leia(alunosPorGrupo)

		enquanto (contador < LIMITE) {

			se ((contador % alunosPorGrupo) == 0) {
				grupo++
			 	escreva("\n")
			}
			
			//escreva(limite, "\n")
			
			se (limite < 0) {
				escreva(alunosAux[0], alunosAux[1])
				sorteado = 0
			} senao {
				sorteado = Util.sorteia(0, limite)
				limite--
			}

			escreva("\n" + alunosAux[sorteado] + " - Grupo " + grupo)
			
			retira_aluno(sorteado, alunosAux, matAux, limite)

			contador++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */