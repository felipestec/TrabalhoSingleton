package novoTeste;

//3 - Exemplo do uso do Singleton em sua linguagem favorita.

public class ChessBoard {
	
	static private ChessBoard instance = null;
	
	private ChessBoard() {}
	static ChessBoard getInstance()
	{
		if(instance == null)
			instance = new ChessBoard();
		return instance;
	}
	
	public static void main(String args[])
	{
		ChessBoard tabuleiro1 = ChessBoard.getInstance();
		ChessBoard tabuleiro2 = ChessBoard.getInstance();
		System.out.println(tabuleiro1);
		System.out.println(tabuleiro2);
	}

}
/*
 *  Faça um relatório sobre o uso do padrão de Projeto Singleton.
	O relatório deve contar as seguintes informações:

		O Padrão Singleton tem como definição garantir que uma classe
		tenha apenas uma instância de si mesma e que forneça um ponto 
		global de acesso a ela. Ou seja, uma classe gerencia a própria 
		instância dela além de evitar que qualquer outra classe crie 
		uma instância dela

1 - O que é o padrão Singleton

		Quando queremos ter uma unica instancia de uma classe, uma maneira 
		facil de acessar essa classe
	
2 - Quando esse padrão de projeto deve ser usado

		O melhor exemplo para a utilização do padrão singleton é na conexão com
		o banco de dados. Ao invés de termos vários pontos no nosso projeto que 
		geram conexões com o banco de dados, podemos ter apenas uma classe singleton 
		que realiza esta conexão, otimizando a performance da aplicação.



 * 
 */
