package aplicacoes;

import java.util.Scanner;

public class ExercicioSQL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exercicio = "Crie um banco de dados para um servi�o de um site de cursos onlines, o nome do banco dever� ter o seguinte nome db_%s, onde o sistema trabalhar� com as informa��es dos produtos desta empresa.\nO sistema trabalhar� com 2 tabelas tb_%s e tb_categoria.\nsiga  exatamente esse passo a passo:\nCrie uma tabela de categorias utilizando a habilidade de abstra��o e determine 3 atributos relevantes do tb_categoria para se trabalhar com o servi�o desse a�ougue.\nCrie uma tabela de tb_produto e utilizando a habilidade de abstra��o e determine 5 atributos relevantes dos tb_produto para se trabalhar com o servi�o desse a�ougue(n�o esque�a de criar a foreign key de tb_categoria nesta tabela).\nPopule esta tabela Categoria com at� 5 dados.\nPopule esta tabela Produto com at� 8 dados.\nFa�a um select que retorne os Produtos com o valor maior do que 50 reais.\nFa�a um select trazendo  os Produtos com valor entre 3 e 60 reais.\nFa�a um select  utilizando LIKE buscando os Produtos com as letras %s.\nFa�a um um select com Inner join entre  tabela categoria e produto.\nFa�a um select onde traga todos os Produtos de uma categoria espec�fica (exemplo todos os produtos que s�o cosm�ticos).\nsalve as querys para cada uma dos requisitos o exerc�cio em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade."; 
		
		System.out.print("Digite o nome do banco de dados: ");
		String bancoDeDados = scanner.next();
		
		System.out.print("Digite o nome da tabela: ");
		String tabela = scanner.next();
		
		System.out.print("Digite as letras da pesquisa (like): ");
		String procura = scanner.next();
		
		System.out.println("              EXERCICIO");
		System.out.println("========================================");
		System.out.println();
		System.out.printf(exercicio, bancoDeDados, tabela, procura);
		
		scanner.close();
	}

}
