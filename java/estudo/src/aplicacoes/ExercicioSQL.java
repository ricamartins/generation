package aplicacoes;

import java.util.Scanner;

public class ExercicioSQL {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exercicio = "Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco deverá ter o seguinte nome db_%s, onde o sistema trabalhará com as informações dos produtos desta empresa.\nO sistema trabalhará com 2 tabelas tb_%s e tb_categoria.\nsiga  exatamente esse passo a passo:\nCrie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desse açougue.\nCrie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de criar a foreign key de tb_categoria nesta tabela).\nPopule esta tabela Categoria com até 5 dados.\nPopule esta tabela Produto com até 8 dados.\nFaça um select que retorne os Produtos com o valor maior do que 50 reais.\nFaça um select trazendo  os Produtos com valor entre 3 e 60 reais.\nFaça um select  utilizando LIKE buscando os Produtos com as letras %s.\nFaça um um select com Inner join entre  tabela categoria e produto.\nFaça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).\nsalve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade."; 
		
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
