programa
{
	inclua biblioteca Util

	funcao copia_alunos(cadeia alunos[], cadeia alunosAux[], inteiro LIMITE) {
		para (inteiro i = 0; i < LIMITE; i++) {
			alunosAux[i] = alunos[i]
		}
	}

	funcao retira_aluno(cadeia alunos[], inteiro indice, inteiro limite) {
		para (inteiro i = indice; i < limite; i++) {
			alunos[i] = alunos[i + 1]
		}
	}
	
	funcao inicio()
	{
		const inteiro LIMITE = 39
		inteiro limite = LIMITE - 1
		//cadeia alunos[LIMITE] = {"A", "B", "C", "D", "E"}
		//cadeia alunosAux[5]
		cadeia alunos[LIMITE] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"}
		cadeia alunosAux[LIMITE]
		inteiro pessoasPorGrupo, sorteado, grupo = 1, contador = 0

		limite = LIMITE - 1, grupo = 1, contador = 0
		
		copia_alunos(alunos, alunosAux, LIMITE)

		escreva("Digite o número de pessoas por grupo: ")
		leia(pessoasPorGrupo)
		
		enquanto (limite > 0) {

			//testa se muda de grupo, se sim aumenta grupo e contador é 1 pois já tem uma pessoa nesse grupo
			//senao aumenta contador
			se (contador == pessoasPorGrupo) {
				grupo++
				contador = 1
			} senao {
				contador++
			}
		
			sorteado = Util.sorteia(0, limite)

			escreva("Grupo " + grupo + "\t" + alunosAux[sorteado] + "\n")

			retira_aluno(alunosAux, sorteado, limite)

			limite--
		}

		//verifica se é necessário mudar o grupo e imprime o último aluno
		//(separado por conta da função sorteia
		se (contador == pessoasPorGrupo) {
			grupo++
			contador = 0
		} senao {
			contador++
		}
		
		escreva("Grupo " + grupo + "\t" + alunosAux[0] + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */